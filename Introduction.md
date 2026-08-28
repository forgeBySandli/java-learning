# Introduction to Java — Theory

## What is Java?
Java is a high-level, object-oriented, class-based programming language developed by **Sun Microsystems** in 1995 (now owned by Oracle). It was designed with the philosophy **"Write Once, Run Anywhere" (WORA)** — meaning Java code compiled on one platform can run on any other platform that supports Java, without needing to be recompiled.

## Why Java?
Java is one of the most widely used languages in enterprise software, Android app development, and backend systems because it is:
- **Simple** — syntax is clean and close to C/C++, but without complex features like pointers
- **Object-Oriented** — everything is modeled around objects and classes, making code modular and reusable
- **Platform Independent** — thanks to the JVM (explained below)
- **Secure** — no explicit pointers, runs in a sandboxed environment (JVM), has built-in security features
- **Robust** — strong memory management, automatic garbage collection, exception handling
- **Multithreaded** — supports concurrent execution of multiple threads for better performance
- **High Performance** — uses Just-In-Time (JIT) compiler for fast execution

## How Java Works — The Core Concept
Java code goes through the following process:

1. **Source Code (.java file)** — you write your program in human-readable Java syntax
2. **Compilation** — the Java Compiler (`javac`) converts this into **bytecode** (`.class` file), which is platform-independent, not machine code
3. **Execution** — the **JVM (Java Virtual Machine)** reads this bytecode and converts it into machine-specific instructions at runtime

This is why Java achieves "Write Once, Run Anywhere" — the bytecode is the same everywhere, only the JVM differs per platform (Windows, Linux, Mac).

## Key Components of Java Platform
| Component | Full Form | Role |
|---|---|---|
| **JDK** | Java Development Kit | Full package for developers — includes compiler, JRE, and development tools |
| **JRE** | Java Runtime Environment | Provides libraries + JVM to run Java programs (no compiler) |
| **JVM** | Java Virtual Machine | Executes bytecode; provides platform independence, memory management, garbage collection |

**Relationship:** JDK ⊃ JRE ⊃ JVM (JDK contains JRE, JRE contains JVM)

## Core Principles of Java (OOP Concepts)
Java is built around four fundamental Object-Oriented Programming principles:

1. **Encapsulation** — wrapping data (variables) and code (methods) together as a single unit (class), and restricting direct access to some of an object's components
2. **Inheritance** — a mechanism where one class acquires properties and behaviors of another class, promoting code reuse
3. **Polymorphism** — the ability of an object to take many forms (method overloading and overriding)
4. **Abstraction** — hiding complex implementation details and showing only essential features to the user

## Structure of a Basic Java Program
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
- `class HelloWorld` — everything in Java lives inside a class
- `public static void main(String[] args)` — the entry point of every Java application; execution starts here
- `System.out.println()` — prints output to the console


Java Introduction

What is Java?

Java is a high-level, object-oriented, class-based programming language developed by Sun Microsystems. It was created by James Gosling and released in 1995.
Java is widely used for developing web applications, desktop applications, mobile applications, enterprise software, and backend systems.

Why is Java Popular?

Java is popular because of its simplicity, security, portability, and platform independence.
The main idea behind Java is:

Write Once, Run Anywhere (WORA)

Java programs are compiled into bytecode, which can run on any system that has a Java Virtual Machine (JVM).

Features of Java

Simple – Java has a relatively easy and clean syntax.

Object-Oriented – Java is based on objects and classes.

Platform Independent – Java bytecode can run on different operating systems using the JVM.

Secure – Java provides various security features.

Robust – Java has strong memory management and exception handling.

Portable – Java programs can be moved between different platforms.

Multithreaded – Java supports executing multiple tasks simultaneously.

High Performance – Java uses Just-In-Time (JIT) compilation for better performance.

JDK, JRE and JVM

JVM – Java Virtual Machine

JVM executes Java bytecode and makes Java platform independent.

JRE – Java Runtime Environment

JRE provides the environment required to run Java applications. It contains the JVM and required libraries.

JDK – Java Development Kit

JDK is used to develop Java applications. It contains the JRE along with development tools such as the Java compiler.

Relationship

JDK → JRE → JVM

First Java Program

class HelloWorld { public static void main(String[] args) { System.out.println("Hello, World!"); } } 

Explanation

class HelloWorld – Defines a class named HelloWorld.

main() – The main method is the starting point of a Java application.

System.out.println() – Prints output on the console.

Conclusion

Java is a powerful and widely used programming language. Learning Java starts with understanding its basic syntax, variables, data types, operators, control statements, classes, objects, inheritance, polymorphism, exception handling, collections, and other important concepts.