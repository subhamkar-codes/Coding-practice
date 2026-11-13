# LeetCode Solutions (Java)

Solutions to LeetCode problems, solved in Java while building problem-solving skills for DSA.

## Solved Problems

| # | Problem | File | Difficulty | Approach |
|---|---------|------|------------|----------|
| 1 | Two Sum | `P0001_TwoSum.java` | Easy | Brute force: check every pair (i, j) with j > i. O(n²) time, O(1) space. |
| 9 | Palindrome Number | `P0009_PalindromeNumber.java` | Easy | Reverse the digits using `% 10` and `/ 10` (no string conversion) and compare with the original. Negatives return false. A `long` holds the reversed value to avoid overflow. O(log n) time, O(1) space. |
| 13 | Roman to Integer | `P0013_RomanToInteger.java` | Easy | HashMap from symbol to value. Scan left to right: subtract a symbol's value if the next symbol is larger, otherwise add it. O(n) time, O(1) space (the map always has 7 entries). |
| 14 | Longest Common Prefix | `P0014_LongestCommonPrefix.java` | Easy | Find the shortest string length, then compare the first string's characters column by column against every other string. Return the prefix at the first mismatch. O(n·m) time (n strings, m shortest length), O(1) extra space. |
| 20 | Valid Parentheses | `P0020_ValidParentheses.java` | Easy | Stack: push each opening bracket. On a closing bracket, the top of the stack must be its matching opener, otherwise invalid. Valid only if the stack is empty at the end. O(n) time, O(n) space. |
| 21 | Merge Two Sorted Lists | `P0021_MergeTwoSortedLists.java` | Easy | Iterative two-pointer merge: pick the smaller head, then repeatedly link the smaller of the two current nodes onto a `tail` pointer. Reuses the existing nodes (no new ones). O(n + m) time, O(1) extra space. |
| 26 | Remove Duplicates from Sorted Array | `P0026_RemoveDuplicatesFromSortedArray.java` | Easy | Two pointers, in place: `i` marks the last unique value; scan with `j`, and when `nums[j]` differs from `nums[i]`, advance `i` and copy the value. Return `i + 1`. O(n) time, O(1) space. |
| 27 | Remove Element | P0027_RemoveElement.java | Easy | Two pointers: read pointer scans, write pointer overwrites in place with non-val elements |
| 28 | Find the Index of the First Occurrence in a String | P0028_FindTheIndexOfTheFirstOccurrenceInAString.java | Easy | Brute force: try every start index, compare chars, break on mismatch, return index if full match |
| 35 | Search Insert Position | P0035_SearchInsertPosition.java | Easy | Binary search (left/right/mid); return left as insertion index when not found |

## File Structure

Each file is named `P<number>_<ProblemName>.java`. The `P` prefix is there because Java class names can't start with a digit.

Every file has two parts:

- **Local test version:** a `main` method that reads input with `Scanner`, so I can run and debug the logic myself.
- **LeetCode submission:** the `Solution` class in the format LeetCode expects, kept as a comment at the bottom for copy-pasting.

## Concepts Practiced

- Arrays and index handling
- Nested loops
- Reading array input with `Scanner`
- HashMap as a lookup table
- String traversal (`charAt`, `substring`)
- Early exit from nested loops
- Stack (LIFO) and matching bracket pairs.
- Linked lists and pointer manipulation
- - Two-pointer technique
- In-place array modification
## Tech

- Language: Java
- IDE: IntelliJ IDEA

## Notes

The Approach column records the method and its time and space complexity. When I find a better solution to a problem, I update its row.

*Built while balancing college coursework and daily coding practice.*
