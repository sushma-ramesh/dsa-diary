# Day 1 - Linear Search

## Topics Covered:
- Linear Search on integers
- Linear Search on strings
- Linear Search on 2D array
- Case-insensitive search (e.g., for usernames)

## Time Complexity:
- Worst Case: O(n)
- Best Case: O(1)

##  When to Use:
- Small data
- Unsorted data
- Simplicity preferred

## What I Learned:
- Dry run makes debugging easier
- Don't forget `.equals()` for Strings
- Nested loop for 2D array search

##  Sample Dry Run:
### Input:
`arr = [10, 25, 30, 45, 60], target = 30`

### Iteration:
- i = 0 → 10 ≠ 30
- i = 1 → 25 ≠ 30
- i = 2 → 30 == 30 Found




# **Day 2 – Binary Search**
 
## **Topics Covered:**
Binary Search on integers (sorted array)

Binary Search on strings (case-insensitive)

Binary Search on 2D arrays (row-wise & column-wise sorted)

Lower Bound & Upper Bound search (first ≥ target and first > target)

## **Time Complexity:**
Worst Case: O(log n)

Best Case: O(1)

2D Array Search: O(log (rows × cols))

## **When to Use:**
When the data is sorted

For fast search in large datasets

To optimize time complexity over linear search

To solve range-based problems (frequency, boundaries, intervals)

## **What I Learned:**
Always use mid = left + (right - left) / 2 to avoid overflow

.compareToIgnoreCase() is used for case-insensitive string comparison

In 2D matrix, flatten the matrix:

row = mid / columns, col = mid % columns

Lower/Upper bound logic is very useful for:

First or last occurrence

Element just greater than or equal to the target

## **Sample Dry Run:**
Input:
arr = [3, 8, 15, 23, 42], target = 23

## **Iteration:**
left = 0, right = 4 → mid = 2 → arr[2] = 15 → 15 < 23 → move right

left = 3, right = 4 → mid = 3 → arr[3] = 23 → target found 


##  **Day 3 – Bubble Sort**
##  **Topics Covered:**
Bubble Sort on integers

Bubble Sort on strings (lexicographical order)

Bubble Sort on 2D arrays (row-wise sorting)

Case-insensitive string sorting

##  **Time Complexity:**
Worst Case: O(n²)

Best Case: O(n) — when already sorted

Average Case: O(n²)

##  **When to Use:**
When simplicity is more important than performance

For small datasets

Good for educational purposes to understand sorting logic

##  **What I Learned:**
Repeatedly compare and swap adjacent elements

Add a boolean flag (swapped) to stop early if no swaps

For strings, use .compareTo() or .compareToIgnoreCase() for sorting

2D Bubble Sort = apply bubble sort individually on each row or flatten and sort

##  **Sample Dry Run (Integers):**
Input:
arr = [5, 3, 8, 2]

##  **Iteration 1:**
5 > 3 → swap → [3, 5, 8, 2]

5 < 8 → no swap

8 > 2 → swap → [3, 5, 2, 8]

##  **Iteration 2:**
3 < 5 → no swap

5 > 2 → swap → [3, 2, 5, 8]

5 < 8 → no swap

##  **Iteration 3:**
3 > 2 → swap → [2, 3, 5, 8] 

##  **Use Cases Implemented:** 
 Bubble Sort on int[]

Bubble Sort on String[]

Bubble Sort on 2D array (int[][])

Case-insensitive String[] sorting (e.g., usernames)
