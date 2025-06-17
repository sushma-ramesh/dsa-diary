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
i = 0 → 10 ≠ 30
i = 1 → 25 ≠ 30
i = 2 → 30 == 30 Found




# **Day 2 – Binary Search**
 
## **Topics Covered:**
-Binary Search on integers (sorted array)

-Binary Search on strings (case-insensitive)

-Binary Search on 2D arrays (row-wise & column-wise sorted)

-Lower Bound & Upper Bound search (first ≥ target and first > target)

## **Time Complexity:**
-Worst Case: O(log n)

-Best Case: O(1)

-2D Array Search: O(log (rows × cols))

## **When to Use:**
-When the data is sorted

-For fast search in large datasets

-To optimize time complexity over linear search

-To solve range-based problems (frequency, boundaries, intervals)

## **What I Learned:**
-Always use mid = left + (right - left) / 2 to avoid overflow

-.compareToIgnoreCase() is used for case-insensitive string comparison

-In 2D matrix, flatten the matrix:

-row = mid / columns, col = mid % columns

-Lower/Upper bound logic is very useful for:

-First or last occurrence

-Element just greater than or equal to the target

## **Sample Dry Run:**
-Input:
arr = [3, 8, 15, 23, 42], target = 23

## **Iteration:**
left = 0, right = 4 → mid = 2 → arr[2] = 15 → 15 < 23 → move right

left = 3, right = 4 → mid = 3 → arr[3] = 23 → target found 


##  **Day 3 – Bubble Sort**
##  **Topics Covered:**
-Bubble Sort on integers

-Bubble Sort on strings (lexicographical order)

-Bubble Sort on 2D arrays (row-wise sorting)

-Case-insensitive string sorting

##  **Time Complexity:**
-Worst Case: O(n²)

-Best Case: O(n) — when already sorted

-Average Case: O(n²)

##  **When to Use:**
-When simplicity is more important than performance

-For small datasets

-Good for educational purposes to understand sorting logic

##  **What I Learned:**
-Repeatedly compare and swap adjacent elements

-Add a boolean flag (swapped) to stop early if no swaps

-For strings, use .compareTo() or .compareToIgnoreCase() for sorting

-2D Bubble Sort = apply bubble sort individually on each row or flatten and sort

##  **Sample Dry Run (Integers):**
-Input:
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
 -Bubble Sort on int[]

-Bubble Sort on String[]

-Bubble Sort on 2D array (int[][])

-Case-insensitive String[] sorting (e.g., usernames)


 ## Day 4 - Selection Sort
 
## Topics Covered:
-Selection Sort on integers

-Selection Sort on strings

-Selection Sort on 2D arrays (row-wise)

-Case-insensitive selection sort (e.g., usernames)

## Time Complexity:
-Case	Time Complexity
-Best Case	O(n²)
-Average	O(n²)
-Worst Case	O(n²)

##  When to Use:
-Small data sets

-When memory writes are costly (selection sort makes fewer swaps than bubble sort)

-Simple sorting logic is acceptable

##  What I Learned: 
-Always track the index of the minimum element during the inner loop

-Use .compareTo() for string comparison and .compareToIgnoreCase() for case-insensitive sorting

-Nested loop logic is key — dry running helps

-In 2D arrays, sort row-by-row for simplicity

## Sample Dry Run (Integers):
-Input:


arr = [64, 25, 12, 22, 11]
## Iteration:

1st Pass:
→ min = 4 (value 11)
→ swap 64 with 11
→ array becomes: [11, 25, 12, 22, 64]

2nd Pass:
→ min = 2 (value 12)
→ swap 25 with 12
→ array becomes: [11, 12, 25, 22, 64]

3rd Pass:
→ min = 3 (value 22)
→ swap 25 with 22
→ array becomes: [11, 12, 22, 25, 64]

4th Pass:
→ already sorted

-Final Output: [11, 12, 22, 25, 64]

## Day 5 - Insertion Sort
## Topics Covered:
-Insertion Sort on integers

-Insertion Sort on strings

-Insertion Sort on 2D arrays (row-wise sorting)

-Case-insensitive insertion sort (e.g., usernames)

## Time Complexity:
Case	Time Complexity
Best Case	O(n)
Average	O(n²)
Worst Case	O(n²)

## When to Use:
-Best for nearly sorted or small datasets

-Simple to implement

-Efficient when the array is partially sorted

-Works well for online input (e.g., typing one element at a time)

## What I Learned:
-Compare and shift elements while going backward through the sorted part of the array

-Insert the key in the correct position

-For strings, use .compareTo() and .compareToIgnoreCase() for case sensitivity

-For 2D arrays, perform insertion sort row-by-row

## Sample Dry Run (Integers):
-Input:
arr = [5, 3, 8, 6, 2]
## Iteration:

i = 1 → key = 3
→ compare 5 > 3 → shift 5
→ insert 3 at index 0
→ [3, 5, 8, 6, 2]

i = 2 → key = 8
→ no shift needed
→ [3, 5, 8, 6, 2]

i = 3 → key = 6
→ 8 > 6 → shift 8
→ insert 6 at index 2
→ [3, 5, 6, 8, 2]

i = 4 → key = 2
→ shift 8, 6, 5, 3
→ insert 2 at index 0
→ [2, 3, 5, 6, 8]

## -Final Output: [2, 3, 5, 6, 8]

