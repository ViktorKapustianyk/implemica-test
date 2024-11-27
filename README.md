# Algorithm Challenges in Java

This repository contains solutions to algorithmic challenges implemented in Java, with a focus on clean code and efficient problem-solving. Each problem is solved using modern Java practices, and unit tests are provided for verification.

---

## **Challenges**

### 1. Catalan Numbers
**Problem:**  
Given \( N \) pairs of parentheses, compute the number of valid combinations of properly opened and closed parentheses using Catalan numbers.

**Highlights:**
- Dynamic programming approach for computing Catalan numbers.
- Handles edge cases like negative input gracefully.

**Key Files:**  
- [`CatalanCalculator.java`](src/main/java/CatalanCalculator.java)  
- [`CatalanCalculatorTest.java`](src/test/java/CatalanCalculatorTest.java)

---

### 2. Minimum Transportation Cost Between Cities
**Problem:**  
Calculate the minimum transportation cost between cities in a graph using Dijkstra's algorithm.

**Features:**
- Efficient graph representation with adjacency lists.
- Handles edge cases like non-existent cities or disconnected paths.

**Example:**  
Cities: `gdansk`, `bydgoszcz`, `torun`, `warszawa`  
Transportation costs:  
- `gdansk -> bydgoszcz (1)`  
- `gdansk -> torun (3)`  
- `bydgoszcz -> warszawa (4)`

**Result:**  
Cost from `gdansk` to `warszawa`: `3`

**Key Files:**  
- [`Graph.java`](src/main/java/Graph.java)  
- [`GraphTest.java`](src/test/java/GraphTest.java)

---

### 3. Sum of Digits in Factorial
**Problem:**  
Find the sum of the digits in the number \( 100! \) (100 factorial).

**Highlights:**
- Efficient factorial calculation using `BigInteger`.
- Clear separation of factorial computation and digit summation.

**Result:**  
Sum of the digits in \( 100! \): `648`

**Key Files:**  
- [`FactorialDigitSum.java`](src/main/java/FactorialDigitSum.java)  
- [`FactorialDigitSumTest.java`](src/test/java/FactorialDigitSumTest.java)

---

## **Technologies Used**
- **Java 17**: Core programming language.  
- **JUnit 5**: For unit testing.  
- **Gradle**: Build and dependency management.  

---

## **Unit Tests**
Comprehensive tests are provided for all challenges. Test classes are located in the src/test/java directory.

**Tested Cases Include:**
- Base cases and edge cases for Catalan numbers.
- Valid and invalid paths for the transportation cost problem.
- Correct factorial computation and digit summation for large numbers.
