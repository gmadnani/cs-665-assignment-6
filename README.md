| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Girish Madnani             |
| Date         | 04/27/2023                 |
| Course       | Spring                     |
| Assignment # | Assignment 6               |

# Assignment Overview

In this Project, I implemented the Factory Method pattern in a email generation system.
The program defines an abstract class Customer with a protected field name and an abstract method getEmailText().
It also defines five concrete subclasses of Customer: BusinessCustomer, ReturningCustomer, FrequentCustomer,
NewCustomer, and VipCustomer, each of which implements the getEmailText() method to return a custom email message.
The program also defines an interface EmailFactory with five methods for creating each type of customer, and an
implementation of EmailFactory called EmailGenerationFactory that creates instances of each type of customer.
Finally, the main() method of the program demonstrates the use of the factory to create instances of each type of
customer and print their email messages.

# GitHub Repository Link:

https://github.com/gmadnani/cs-665-assignment-6

# Changes Description

#### Explain the specific opportunities and the reasoning behind them.

Use enum for customer types: Instead of creating separate classes for each type of customer (e.g. BusinessCustomer,
FrequentCustomer, etc.), an enum can be used to represent the different types of customers. This can simplify the code
and make it more extensible, as new customer types can be easily added without having to create new classes. The
Customer class can then have a member variable of the enum type to represent the customer type, and the behavior can be
determined based on the customer type.

Remove code duplication: In the getEmailText() method of each Customer subclass, the code for formatting the email text
is duplicated. This violates the DRY (Don't Repeat Yourself) principle of software development. Instead, the formatting
logic can be abstracted into a separate method in the Customer abstract class, and each subclass can call that method to
generate the email text. This way, if the formatting logic needs to be updated in the future, it can be done in one
place, reducing the risk of bugs, and making maintenance easier.

Dependency Injection (DI): In the current implementation, the Main class is tightly coupled with the
EmailGenerationFactory class. This makes it hard to test the Main class in isolation or switch to a different
implementation of the EmailFactory interface if needed.
To solve this problem, we can use Dependency Injection (DI) to separate the creation of objects from their use. In DI,
the dependencies of an object are passed to it, rather than being created inside it. This makes it easier to test the
object in isolation and switch implementations of its dependencies.
To implement DI, we can modify the Main class to accept an instance of the EmailFactory interface as a constructor
argument. We can then create an instance of the Main class with a specific implementation of the EmailFactory interface,
which can be injected into the Main class.

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/)
on your system.

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a
standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains
information about the project, such as its dependencies, the build configuration, and the plugins used for building and
packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the
dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that
builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to
use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports,
and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile

Type on the command line:

```bash
mvn clean compile
```

## JUnit Tests

JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the
behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is
annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the
code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and
easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code
they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all
required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time
changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for
manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:

```bash
mvn clean test
```

## Spotbugs

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool
that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems
or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and
other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately
obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to
meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the
development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues
later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential
security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.

## Checkstyle

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source
tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as
well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on
any issues or violations of the coding standards defined in its configuration. This includes issues like code style,
code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices,
making it easier for other developers to read and maintain. It can also help to identify potential issues before the
code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a
wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing
tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser.

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




