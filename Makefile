MarkdownParse.class: MarkdownParse.java
    javac MarkdownParse.java

test: MarkdownParseTest.java MarkdownParse.class
    javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar  MarkdownParseTest.java
    java -cp .:lib/junit-4.1.3.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest


