# Namespace Declaration

A namespace declaration defines the a container for the contents of the file.
Thus, other DABL files (or tools that process DABL) can refer to elements of the
file via the namespace. Think of a namespace the way that you think of a Java package.

There must be one and only one namespace declaration in a DABL file.

Multiple DABL files can
specify the same namespace: in that case, the files are logically combined. It is
an error if there are any conflicts when combining.

A namespace is comprised of one or more period-separated identifiers, where each
identifier must consist of characters within the range a-z, A-Z, 0-9, _, -, and must
not begin with a number.
