# What Is DABL?

DABL stands for "Dependent Artifact Build Language". It is a language for defining
software dependencies.

# Motivation

Existing “build” languages (e.g., make, ant, maven, gradle, Jenkins “pipeline”)
leave much to be desired. They tend to be non-[composable](https://en.wikipedia.org/wiki/Composability),
weakly typed, and have poor extensibility features. As such, they make build processes
brittle and unreliable and also limit reusability.

Another problem with existing build languages is that they don't promote idempotency.
That is, it is common that build systems operate on a "workspace" or current
directory, and so running a build or test suite often leaves behind intermediate artifacts.
Such artifacts can cause a build to succeed but then fail if run a second time.
Build languages do not generally promote idempotency, because they
don't define any kind of isolation or containerization concept for build tasks,
with inputs and outputs clearly defined and no side effects.

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

* The build language is defined as a true language, with a normative language definition and
	well specified syntax and semantics (see [Language Reference](langref)),
	thereby avoiding ambiguity in the language itself.
	Ambiguity is the enemy of reliability.
* The build language is strongly typed, in order to promote maintainability and reliability.
* The build language uses information hiding, encapsulation, and true modularity 
	in order to promote reuse, extensibility, composability, and idempotency.
* In particular, the build language defines isolation for tasks, with clearly defined inputs
	and outputs and no side effects.
* The build language is concise but not cryptic, and encourages the definition of
	builds that are easy to read and understand, and that are unambiguous.
	Again, ambiguity is the enemy of reliability.
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

The DABL compiler is designed as a self-contained embeddable component that can be
embedded in Java applications. For a guide on how to embed the DABL compiler,
see [Embedding the Compiler In an Application](embedding/README.md).

# Compiler Design

See [java/scaledmarkets/dabl](java/scaledmarkets/dabl).

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

