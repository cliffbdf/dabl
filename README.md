# What Is DABL?

DABL stands for "Dependent Artifact Build Language". It is a language for defining
software dependencies.

# Motivation

Existing “build” languages (e.g., make, ant, maven, gradle, Jenkins “pipeline”)
leave much to be desired. They tend to be non-[composable](https://en.wikipedia.org/wiki/Composability),
weakly typed, and have poor extensibility features. As such, they make build processes
brittle and unreliable and also limit reusability.

There is no reason why it needs to be this way: The current state of affairs stems from
the “guru” culture of system administration, and the still present 1980s era tradition
that build languages are quick-to-modify scripts that are maintained by sysadmin
“gurus” who are above accountability for the maintainability of their scripts.
Yet, infrastructure code definitely warrants high reliability and maintainability,
and—increasingly—build pipelines are part of infrastructure. Thus, the time for
reliable, composable, and maintainable build languages has come.

Treating pipeline definition as a first-class design activity, supported by a
*true language*, is consistent with the DevOps philosophy of treating the build
and deployment pipeline as a system to be designed, coded, and maintained. We
will note that a "true language" implies a normative language spec; and a "true
language" is not merely a set of methods on top of an existing general
purpose language as many so-called "domain-specific languages" are.

For robust infrastructure code, a better model than current practice is needed, whereby,

* The build language is strongly typed, in order to promote maintainability and reliability.
* The build language uses information hiding, encapsulation, and true modularity in order to promote reuse and extensibility.
* The build language is defined as a true language, with a normative language definition and
	well specified syntax and semantics (see [Language Reference](langref)).
	Ambiguity is the enemy of reliability.
* The build language is concise but not cryptic, and encourages the definition of
	builds that are easy to read and understand, and that are unambiguous.
* The build language lends itself well to static analysis, for—say—security analysis.
	(For that to be possible, it is essential that the language is *not merely an
	extension of a general purpose language*.)
* The maintainers of the build language have a high regard for backward
	compatibility, so that language changes do not contribute to the instability
	of build systems. We (Scaled Markets) plan to use a deprecation approach when
	breaking changes are necessary, which we hope will be extremely infrequent; in
	addition, we plan to submit both the DABL language and the runtime object model
	(Abstract Syntax Tree) to a standards body.

See also https://drive.google.com/open?id=1xoyDMebGHedfBUFcsMUkjQJHSwrt3sCFF8CDhrVaTjo

# What's In This Project

* The language definition (formal grammar file [dabl.sablecc](dabl.sablecc), and
[Language Reference](langref/README.md)).
* A DABL compiler, written in Java using version 3.2 of the
	[SableCC compiler generation tool](http://www.sablecc.org/).
	The compiler is a Java package, which has a main method—and so it
	can be called form a command line—but it can also
	be called via its API, so that the compiler can be embedded in other
	Java applications. If called from the command line, the compiler merely
	parses the input file. However, if a Java program instantiates a
	`scaledmarkets.dabl.main.Dabl` object and calls the `process` method, an object
	model is returned that can be used by a tool to act on the compiled input.
	(Java API docs can be found [here](https://scaledmarkets.github.io/dabl/).)
* A sample DABL file, [example.dabl](example.dabl).

# Embedding the Compiler In an Application

When the compiler processes a DABL source file, the output of the compiler is a
[`CompilerState`](https://scaledmarkets.github.io/dabl/scaledmarkets/dabl/main/CompilerState.html)
object. A `CompilerState` contains a a field,
```
public Start ast;
```
A [`Start`](https://scaledmarkets.github.io/dabl/scaledmarkets/dabl/node/Start.html)
is the root of a node tree that implements the Abstract Syntax Tree (AST)
that is defined at the end of the [dabl.sablecc](dabl.sablecc)
grammar file. The AST
can be accessed at runtime; thus, one can build a tool that compiles DABL
files and then operates on the resulting AST. For an example
of accessing the object model, see the [piper project](https://github.com/Scaled-Markets/piper).
Piper is a build system based on DABL.

# Compiler Design

See [java/scaledmarkets/dabl/main](java/scaledmarkets/dabl/main).

Javadocs can be found [here](https://scaledmarkets.github.io/dabl/).

# Building the Project

To build the project, set the environment-specific tool locations in
[makefile.inc](https://github.com/Scaled-Markets/dabl/blob/master/makefile.inc).
Then run `make all`. The output of the
build is a JAR file, `dabl.jar`, which can be included in any
Java project. (See "Binary Download" below.)

Note that the Java class `scaledmarkets.dabl.Config` is generated by the build
process, so do not edit it by hand.

# Binary Download

Binaries of the compiler JAR file can be found [here](https://github.com/Scaled-Markets/dabl/releases).
Javadocs can be found [here](https://scaledmarkets.github.io/dabl/).

