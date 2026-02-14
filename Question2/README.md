# Question 2 - Remove K Digits

## Problem Statement

Given a string `num` representing a non-negative integer and an integer `k`,  
remove `k` digits from the number so that the new number is the smallest possible.

The resulting number must not contain leading zeroes.  
If all digits are removed, return `"0"`.

---

## Approach

A greedy approach is used.

We iterate through the digits and remove the previous digit if it is greater than the current digit and we still have removals left.  
If removals remain after processing all digits, we remove digits from the end.  
Finally, leading zeroes are removed from the result.

This ensures the smallest possible number is formed.

---

## How to Run the Program

### Step 1: Open Terminal in VS Code

Make sure you are inside the root folder:

```
paperflite-assignment
```

### Step 2: Navigate to the Question2 source folder

```
cd Question2/src
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

1. Enter a string representing a non-negative integer.
2. Enter an integer `k` representing how many digits to remove.

Constraint:
- `k` will be between 0 and the length of the number.

---

## Sample Run

### Input

Enter the number as a string:
1432219
Enter the number of digits to remove (k):
3


### Output

The smallest possible number after removing 3 digits is: 1219

