# Java Projects

This repository contains a collection of beginner-friendly Java programs that demonstrate basic input handling, conditional logic, loops, and mathematical calculations.

---

## 1. Mortgage Calculator

A simple Java program that calculates a user's monthly mortgage payment using the basic mortgage formula.

### Inputs:
- **Principal** (Loan amount)
- **Annual Interest Rate**
- **Loan Period** (in years)

### Logic:
The program uses the standard mortgage formula:
M = P [ r(1 + r)^n ] / [ (1 + r)^n – 1 ]

Where:
- `M` is the monthly payment
- `P` is the principal loan amount
- `r` is the monthly interest rate
- `n` is the number of months

### Features:
- Uses `Scanner` to read user input
- Utilizes `Math.pow()` from the `Math` class for exponentiation
- Formats the output using `NumberFormat.getCurrencyInstance()`

---

## 2. FizzBuzz

A fun and classic Java program that prints:
- `"Fizz"` if the number is divisible by **5**
- `"Buzz"` if divisible by **3**
- `"FizzBuzz"` if divisible by both **3 and 5**
- The number itself if it's divisible by neither

### Input:
- A number (`double`)

### Logic:
Uses basic `if-else` statements to determine divisibility using the modulus operator (`%`).

---

## 3. Mortgage Calculator II

An improved version of the Mortgage Calculator with input validation using loops.

### Inputs (with validation):
- **Principal**: Must be between **1,000** and **1,000,000**
- **Annual Interest Rate**: Must be between **0%** and **100%**
- **Loan Period**: Must be between **1** and **30** years

### Features:
- Uses `while` loops to enforce valid input
- Guides the user to enter acceptable values
- Retains all core features from the original mortgage calculator

---
