# Testing Java
Basic Testing on Java Course

## Table of contents

* [General info](#general-info) 
* [Technologies](#technologies) 
* [Setup](#setup)
* [Concepts](#concepts)

## General info

On this course I learned the good practices of testing and how to implement tests on Java. We sis several examples to understand the concepts and implementations for the types of testing.

Testing has great benefits, since it helps to check our app's requirements, documentation, boost our confidence in our code and to refactor our code.

We can also implement Test Driven Development that consists of creating the tests first and then implementing the code to pass those tests.

Another important thing I learned is to not only test typical scenarios, but also extreme ones and of error to verify that our app's behavior is as expected.

## Technologies

On this course I used the following development technologies:
 <!-- - Visual Studio Code -->
 - Git
 - Github
 - IntelliJ IDEA 2021 1.2
 - OpenJDK 11
 - XAMPP
 - Postman

## Setup

The setup for this project was made on a Windows 10 OS.

### IntelliJ IDEA

1. Go to [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
2. Download the Community version (Free, built on open source)

### OpenJDK
For this course we used 2 versions of OpenJDK.

1. Go to [https://adoptopenjdk.net/](https://adoptopenjdk.net/)
2. Download the following versions:
    - OpenJDK 8
    - OpenJDK 11


## Concepts

### Types of Tests:
* **Unit:** tests a function or concrete class in our project
* **Integration:** tests how different components connect with each other
* **Functional:** test a functionality of our project, may involve several classes
* **Start to Finish:** test a process of the project
* **Stress:** tests if our app can withstand a great amount of processes and peticions at once

### Test analysis
1. **Arrange:** prepare the objects to be used
2. **Act:** run the method that you want to test
3. **Assert:** check the results

### TTD Cycle
1. **Red:** write a test that fails
2. **Green:** write the code necessary to pass that test
3. **Refactor:** improve code, only when the tests are passed

