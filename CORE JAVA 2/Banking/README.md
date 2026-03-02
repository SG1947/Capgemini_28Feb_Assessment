# Secure-banking-transaction-engine
A secure banking transaction engine built using Core Java, demonstrating OOP principles, MVC architecture, method overloading, runtime polymorphism, and custom exception handling.

## Problem Statement

A fintech company is building a **Secure Banking Transaction Engine** for internal audits and simulations.  
The system must manage different bank account types while ensuring **data safety, validation, authorization, and robust exception handling**.

You are required to design and implement this system using **core Java object-oriented principles**.

---

## Requirements

### 1. Core Design
- Treat **class**, **abstract class**, and **interface** as templates appropriately.
- Create a base abstraction for a **Bank Account**.

### 2. Bank Account Details
Each bank account must have:
- Account Number
- Account Holder Name
- Balance

### 3. Encapsulation Rules
- All variables must be `private`.
- Balance must **never** be directly accessible or modifiable.
- Access to balance must be provided only through **controlled getters and setters**.

### 4. Validation & Authorization
Apply the following rules inside setters or service methods:
- Balance cannot be negative.
- Withdrawal beyond available balance must be prevented.
- Invalid transaction amounts must be rejected.

### 5. Account Types
Implement at least:
- Savings Account
- Current Account

Behavior must differ using **runtime polymorphism**.

### 6. Polymorphism & Overloading
- Overload methods for:
  - Deposit (cash, online)
  - Withdraw (with and without remarks)
- Override transaction behavior where required.

### 7. Exception Handling
- Create **custom checked exceptions**:
  - `InvalidAmountException`
- Create **custom unchecked exceptions**:
  - `InsufficientBalanceException`
- Demonstrate:
  - `try-catch-finally`
  - `throw` and `throws`
  - Exception propagation

---

## Constraints

- No public variables allowed.
- No switch-case for account behavior.
- Proper object-oriented design is mandatory.
