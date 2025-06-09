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
