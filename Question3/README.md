# Question 3 - Word Pattern

## Problem Statement

Given a pattern and a string `s`, determine if `s` follows the same pattern.

A valid match requires a bijection:
- Each letter in the pattern maps to exactly one word.
- Each word maps to exactly one letter.
- No two letters map to the same word.
- No two words map to the same letter.

---

## Approach

We use two HashMaps.

One map stores character → word.  
Another map stores word → character.

While iterating:
- If a mapping already exists, it must match.
- If it does not exist, we create it.
- If any conflict occurs, return false.

This guarantees a one-to-one mapping.

---

## How to Run the Program

### Step 1: Navigate to the source folder

From the root project directory:

```
cd Question3/src
```

### Step 2: Compile

```
javac Solution.java
```

### Step 3: Run

```
java -cp . Solution
```

---

## Input Format

1. Enter a pattern string.
2. Enter a space-separated string of words.

Constraint:
- Number of characters in pattern must match number of words.

---

## Sample Run

### Input

Enter pattern:
abba
Enter string:
dog cat cat dog


### Output

String follows the pattern: true

