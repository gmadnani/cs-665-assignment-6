| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Girish Madnani             |
| Date         | 03/16/2023                 |
| Course       | Spring                     |
| Assignment # | Assignment 3               |

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

https://github.com/gmadnani/cs-665-assignment-3

# Implementation Description

#### Explain the level of flexibility in your implementation, including how new object types can be easily added or removed in the future.

The implementation of the Factory Method design pattern demonstrated in this program is quite flexible and allows for
easy addition or removal of new object types in the future.
To add a new object type, all that is required is to create a new subclass of Customer and implement the getEmailText()
method to return the desired custom email message. Then, a new method would need to be added to the EmailFactory
interface for creating instances of the new subclass, and the EmailGenerationFactory implementation would need to be
updated to include a corresponding method for creating instances of the new subclass.
Similarly, to remove an object type, it would only be necessary to remove the corresponding subclass of Customer, as
well as the method for creating instances of that subclass in both the EmailFactory interface and the
EmailGenerationFactory implementation.
This flexibility is due to the separation of object creation logic into a separate factory class, which allows the
client code to create objects without needing to know the details of how they are created. This makes it easy to add or
remove object types in the future, without affecting the rest of the code.

#### Discuss the simplicity and understandability of your implementation, ensuring that it is easy for others to read and maintain.

The implementation of the Factory Method pattern in this program is designed to be simple and easy to understand. The
classes are well-structured and follow standard Java programming conventions, using meaningful and descriptive names for
variables, methods, and classes. This approach makes it easy for others to read and maintain the code. Additionally, the
use of an abstract Customer class and concrete subclasses for each type of customer provides a clear and straightforward
way to create custom email messages for different customer types. The EmailFactory interface and its implementation in
the EmailGenerationFactory class are also simple and clear, defining a set of methods to create different types of
customers. Overall, the implementation of the Factory pattern in this program is designed with readability and
maintainability in mind, making it easy for others to understand and modify the code as needed.

#### Describe how you have avoided duplicated code and why it is important.

In this implementation of the Factory Method pattern, duplicated code is avoided by utilizing inheritance and
polymorphism. The Customer class is an abstract base class that defines a common interface and basic functionality for
all types of customers. Each concrete subclass of Customer then provides custom implementation for specific types of
customers. By doing this, we avoid the need to duplicate code for common functionality across all the different types of
customers.
For example, the getEmailText() method is implemented in the Customer base class and is inherited by all the concrete
subclasses. Each subclass then overrides the method to provide its own custom implementation for the email message. This
approach ensures that the code is modular, flexible, and maintainable, as changes to the base class will automatically
propagate to all the subclasses that inherit from it.

#### If applicable, mention any design patterns you have used and explain why they were chosen.

In this implementation, the Factory Method design pattern is used to create different types of customers based on
their classification. The EmailFactory interface defines a set of methods for creating different types of customers, and
the EmailGenerationFactory class provides concrete implementations of these methods to create instances of the
corresponding customer classes.
The Factory pattern is chosen in this implementation because it provides a flexible and extensible way to create objects
based on their classification. It allows us to abstract away the details of object creation and provide a simple
interface for creating objects of different types. This makes it easier to maintain the code and add new types of
customers in the future.
Furthermore, the Factory pattern allows us to decouple the process of object creation from the rest of the code, which
makes it easier to test and modify the creation process independently. By using this pattern, we can ensure that the
code is modular, flexible, and maintainable, which are all desirable qualities in software development.

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




