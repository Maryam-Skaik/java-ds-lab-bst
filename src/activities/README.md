<h1 align="center">📌 Activity – Binary Search Trees (BST)</h1>

![Course](https://img.shields.io/badge/Data%20Structures-Lab-%2373c2fb)
![Topic](https://img.shields.io/badge/Topic-Binary%20Search%20Tree-%23ffb74d)
![Language](https://img.shields.io/badge/Language-Java-%23e57373)
![Level](https://img.shields.io/badge/Level-Intermediate-%2381c784)

---

## 🎯 Activity Objectives

This activity is designed to assess your **conceptual understanding** and **practical implementation skills** of **Binary Search Trees (BST)**.

By completing this activity, you will demonstrate your ability to:

- Apply **BST ordering rules** correctly
- Implement **recursive tree algorithms**
- Analyze tree behavior using traversal logic
- Translate theoretical properties into correct code

---

## 📚 Background

A **Binary Search Tree (BST)** is a binary tree that maintains an ordered structure, allowing efficient searching, insertion, and deletion.

In this activity, you will work directly with BST properties discussed in the lab, **without modifying the provided BST implementation**.

---

## 🛠 General Rules & Constraints

❌ Do NOT use any Java built-in tree structures (`TreeMap`, `TreeSet`, etc.)<br>
❌ Do NOT convert the tree to arrays or lists (unless explicitly stated)<br>
✅ All solutions must be **recursive**<br>
✅ Time complexity must respect BST properties<br>
❌ No hardcoded values<br>
❌ Do not rebalance the tree (this is NOT AVL)<br>

---

## 🧪 Activity Tasks

Below are the tasks along with references to the **solution files**, fully commented and explained.

### **Task 1: Find Minimum and Maximum Value in a BST**

📌 **Objective:**  
Implement methods to find the **minimum** and **maximum** values stored in a BST.

📘 **Key Insight:**  
- Minimum value is found by following **left child pointers**
- Maximum value is found by following **right child pointers**

📥 **Input:**  
Root of a BST

📤 **Output:**  
Minimum value  
Maximum value

📌 **Expected Complexity:**  
`O(h)` where `h` is the height of the tree

**Solution File: [FindMinMax.java](FindMinMax.java)**

---

### **Task 2: Validate a Binary Search Tree**

📌 **Objective:**  
Determine whether a given binary tree satisfies **BST properties**.

📘 **Key Insight:**  
Each node must satisfy a **range constraint**, not just local comparisons.

📥 **Input:**  
Root of a binary tree

📤 **Output:**  
`true` if valid BST, otherwise `false`

📌 **Hint:**  
Use a recursive **min–max range** approach.

**Solution File: [ValidateBST.java](ValidateBST.java)**

---

### **Task 3: Count Nodes in a Given Range**

📌 **Objective:**  
Count the number of nodes whose values lie within a given range `[low, high]`.

📘 **Key Insight:**  
BST ordering allows pruning unnecessary subtrees.

📥 **Input:**  
- Root of BST  
- Two integers `low` and `high`

📤 **Output:**  
Number of nodes within the range

📌 **Expected Complexity:**  
Better than `O(n)` for balanced trees

**Solution File: [CountNodesInRange.java](CountNodesInRange.java)**

---

### **Task 4: Convert a Sorted Array to a BST**

📌 **Objective:**  
Convert a **sorted array** into a **height-balanced BST**.

📘 **Key Insight:**  
- Middle element becomes the root
- Recursively apply to left and right halves

📥 **Input:**  
Sorted integer array

📤 **Output:**  
Root of a balanced BST

📌 **Expected Complexity:**  
`O(n)`

**Solution File: [SortedArrayToBST.java](SortedArrayToBST.java)** 

---

## ⚠️ Common Mistakes to Avoid

- Using inorder traversal to validate BST incorrectly
- Ignoring range constraints
- Writing iterative solutions
- Traversing the entire tree unnecessarily
- Confusing Binary Tree with BST

---

## ✅ Learning Outcomes

After completing this activity, you should be able to:

- Implement core BST-based algorithms
- Reason about tree ordering and recursion
- Prepare for advanced trees (AVL, Red-Black)

---

Good luck, and focus on **understanding the structure, not memorizing code**.
