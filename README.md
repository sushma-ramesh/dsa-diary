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




**Day 2 – Binary Search**
 
**Topics Covered:**
Binary Search on integers (sorted array)

Binary Search on strings (case-insensitive)

Binary Search on 2D arrays (row-wise & column-wise sorted)

Lower Bound & Upper Bound search (first ≥ target and first > target)

**Time Complexity:**
Worst Case: O(log n)

Best Case: O(1)

2D Array Search: O(log (rows × cols))

**When to Use:**
When the data is sorted

For fast search in large datasets

To optimize time complexity over linear search

To solve range-based problems (frequency, boundaries, intervals)

**What I Learned:**
Always use mid = left + (right - left) / 2 to avoid overflow

.compareToIgnoreCase() is used for case-insensitive string comparison

In 2D matrix, flatten the matrix:

row = mid / columns, col = mid % columns

Lower/Upper bound logic is very useful for:

First or last occurrence

Element just greater than or equal to the target

**Sample Dry Run:**
Input:
arr = [3, 8, 15, 23, 42], target = 23

**Iteration:**
left = 0, right = 4 → mid = 2 → arr[2] = 15 → 15 < 23 → move right

left = 3, right = 4 → mid = 3 → arr[3] = 23 → target found 
