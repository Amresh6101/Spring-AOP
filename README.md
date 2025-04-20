# Spring AOP (Aspect-Oriented Programming) Guide

Spring AOP (Aspect-Oriented Programming) is a powerful feature in the Spring Framework that helps separate cross-cutting concerns (like logging, security, and transactions) from the business logic.

---

## ✨ Key Concepts

### 🔹 Aspect
An **Aspect** is a module or class that encapsulates cross-cutting concerns. In Spring, it's a class annotated with `@Aspect` and typically also with `@Component` so it's picked up by component scanning.

### 🔹 Pointcut
A **Pointcut** is an expression that matches join points. It tells the AOP framework which methods to intercept.

### 🔹 JoinPoint
A **JoinPoint** represents a point during execution (e.g., method call). You can access:
Method name
Method arguments
Target object

### 🔹 Advice
An **Advice** is the action taken by an aspect at a particular join point. Think of it as what you want to do and when you want to do it — like logging before a method executes or validating something after a method returns.

### 🔹 Application Output
![Screenshot 2025-04-20 145331](https://github.com/user-attachments/assets/a763f6db-78ef-4f19-b1a5-754e8a99b200)
