# Makefile for DABL compiler.
# Written by Cliff Berg, Scaled Markets.

# This makefile contains no information about file structure or tool locations.
# All such configurations should be made in makefile.inc

include makefile.inc


################################################################################
# Tasks
.PHONY: all manifest config parser jar compile dist check runsonar clean info

all: test dist

# Create the manifest file for the JAR.
manifest:
	echo "Main-Class: $(main_class)" > Manifest
	echo "Specification-Title: $(PRODUCT_NAME)" >> Manifest
	echo "Specification-Version: $(DABL_VERSION)" >> Manifest
	echo "Specification-Vendor: $(ORG)" >> Manifest
	echo "Implementation-Title: $(main_class)" >> Manifest
	echo "Implementation-Version: $(BUILD_TAG)" >> Manifest
	echo "Implementation-Vendor: $(ORG)" >> Manifest

# Create a Config.java file that contains the current application version.
config:
	echo "package scaledmarkets.dabl;" > $(src_dir)/$(package)/Config.java
	echo "public class Config {" >> $(src_dir)/$(package)/Config.java
	echo "public static final String DablVersion = \"$(DABL_VERSION)\";" >> $(src_dir)/$(package)/Config.java
	echo "}" >> $(src_dir)/$(package)/Config.java

# Generate the DABL parser.
parser: dabl.sablecc $(sable_out_dir) # Generate dabl compiler tables and classes.
	$(JAVA) -jar $(sable)/lib/sablecc.jar -d $(sable_out_dir) --no-inline dabl.sablecc
	$(JAVAC) -Xmaxerrs $(maxerrs) -cp $(buildcp) -d $(build_dir) \
		$(sable_out_dir)/$(package)/node/*.java \
		$(sable_out_dir)/$(package)/lexer/*.java \
		$(sable_out_dir)/$(package)/analysis/*.java \
		$(sable_out_dir)/$(package)/parser/*.java
	cp $(sable_out_dir)/$(package)/lexer/lexer.dat $(build_dir)/$(package)/lexer
	cp $(sable_out_dir)/$(package)/parser/parser.dat $(build_dir)/$(package)/parser

# Create the directory into which the generated parser source files will be placed.
$(sable_out_dir):
	mkdir $(sable_out_dir)

# Create the directory that will contain the compiled class files.
$(build_dir):
	mkdir $(build_dir)

# Create the directory that will contain the compiled test class files.
$(test_build_dir):
	mkdir $(test_build_dir)

# Create the directory that will contain the packaged application (JAR file).
$(jar_dir):
	mkdir $(jar_dir)

# Package application into a JAR file.
jar: $(jar_dir)/$(JAR_NAME).jar

$(jar_dir)/$(JAR_NAME).jar: $(classfiles) manifest $(jar_dir)
	$(JAR) cvfm $(jar_dir)/$(JAR_NAME).jar Manifest -C $(build_dir) scaledmarkets
	rm Manifest

# Define the 'compile' target so that we can reference it in .DEFAULT_GOAL.
compile:
	$(JAVAC) -Xmaxerrs $(maxerrs) -cp $(buildcp) -d $(build_dir) \
		$(src_dir)/sablecc/*.java \
		$(src_dir)/$(package)/*.java \
		$(src_dir)/$(package)/main/*.java

# Define 'dist' target so we can reference it in 'all' target.
dist: $(jar_dir)/$(JAR_NAME).jar

# Run parser to scan a sample input file. This is for checking that the parser
# can recognize the language.
check:
	$(JAVA) -classpath $(build_dir) scaledmarkets.dabl.main.Dabl --analyzeonly example.dabl

# Compile the test source files.
test_compile:
	javac -cp $(CUCUMBER_CLASSPATH) -d $(test_build_dir) \
		$(test_src_dir)/steps/$(test_package)/*.java

# Run Cucumber tests.
test:
	java -cp $(CUCUMBER_CLASSPATH):$(test_build_dir):$(jar_dir)/$(JAR_NAME).jar \
		cucumber.api.cli.Main \
		--glue test $(test_src_dir)/features \
		--tags @done

# Perform code quality scans.
runsonar:
	$(SONAR_RUNNER)

clean:
	rm -r -f $(build_dir)
	rm -r -f $(jar_dir)
	rm -r -f $(sable_out_dir)/*
	rm -f Manifest

info:
	@echo "Makefile for $(PRODUCT_NAME)"
