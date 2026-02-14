# Question 1 - Single Number

## Problem Statement

Given a non-empty array of integers `nums`, every element appears twice except for one.  
Find that single number.

---

## Approach

We use the XOR (^) operator.

When two identical numbers are XORed, they cancel each other out.  
By XORing all elements in the array, the duplicate values become zero and only the number that appears once remains.

---

## How to Run the Program

### Step 1: Open Terminal in VS Code

Make sure you are inside the root folder:

```
paperflite-assignment
```

### Step 2: Navigate to the Question1 source folder

```
cd Question1/src
```

### Step 3: Compile the Java file

```
javac Solution.java
```

If compilation is successful, a `Solution.class` file will be generated.

### Step 4: Run the program

```
java -cp . Solution
```

---

## Input Format

1. Enter an integer `n` representing the number of elements.
2. Enter `n` space-separated integers.

Constraint:
- Every element appears twice except one element which appears only once.

---

## Sample Run

### Input
```
Enter number of elements:
5
Enter the elements of the array:
7 3 5 3 7
```

### Output
```
The single number is: 5
```
