# Lab 1: Arrays and Complexity Basics

## Overview
This project implements a fixed-capacity integer array manager (`ScoreArrayManager.java`) in Java[cite: 1, 4]. It demonstrates basic array operations including insertion with element shifting, updating values, deletion, and capacity management, alongside complexity analysis ($O(1)$ updates and $O(n)$ insertions/deletions)[cite: 1].

## Features
* **Fixed-Capacity Array Storage:** Manages scores using a pre-allocated integer array[cite: 1].
* **`insertAt(int index, int value)`:** Inserts an element at a specified index and shifts subsequent elements right ($O(n)$ complexity)[cite: 1, 2].
* **`updateScore(int index, int value)`:** Updates an element at a specific index in constant time ($O(1)$ complexity)[cite: 1].
* **`deleteAt(int index)`:** Removes an element from a specified index and shifts elements left[cite: 1].
* **Helper Methods:** Tracks size, capacity, and empty/full status[cite: 1].

## How to Run
1. Open your terminal in the project directory.
2. Compile the Java file:
   ```bash
   javac ScoreArrayManager.java
