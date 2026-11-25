# LeetCode Solutions (Java)

Solutions to LeetCode problems, solved in Java while building problem-solving skills for DSA.

## Solved Problems

| # | Problem | File | Difficulty | Approach |
|---|---|---|---|---|
| 1 | Two Sum | `solutions/src/P0001_TwoSum.java` | Easy | Brute force: check every pair `(i, j)` with `j > i`. O(n²) time, O(1) extra space. |
| 9 | Palindrome Number | `solutions/src/P0009_PalindromeNumber.java` | Easy | Reverse the digits using `% 10` and `/ 10` without converting to a string, then compare with the original. Negative values return false. A `long` holds the reversed value to avoid overflow. O(log n) time, O(1) space. |
| 13 | Roman to Integer | `solutions/src/P0013_RomanToInteger.java` | Easy | Use a HashMap from symbols to values. Scan left to right, subtracting when the next symbol is larger and adding otherwise. O(n) time, O(1) space. |
| 14 | Longest Common Prefix | `solutions/src/P0014_LongestCommonPrefix.java` | Easy | Find the shortest string length, then compare characters column by column until a mismatch. O(n·m) time, where n is the number of strings and m is the shortest length; O(1) extra space, excluding the returned prefix. |
| 20 | Valid Parentheses | `solutions/src/P0020_ValidParentheses.java` | Easy | Use a stack: push opening brackets and check each closing bracket against the top. The string is valid if the stack is empty at the end. O(n) time, O(n) space. |
| 21 | Merge Two Sorted Lists | `solutions/src/P0021_MergeTwoSortedLists.java` | Easy | Iteratively merge with two pointers and a `tail`, reusing the existing nodes. O(n + m) time, O(1) extra space. |
| 26 | Remove Duplicates from Sorted Array | `solutions/src/P0026_RemoveDuplicatesFromSortedArray.java` | Easy | Use two pointers in place: keep the last unique value at `i`, scan with `j`, and copy each new value forward. O(n) time, O(1) space. |
| 27 | Remove Element | `solutions/src/P0027_RemoveElement.java` | Easy | Use read and write pointers. Copy each non-`val` element forward in place. O(n) time, O(1) space. |
| 28 | Find the Index of the First Occurrence in a String | `solutions/src/P0028_FindTheIndexOfTheFirstOccurrenceInAString.java` | Easy | Try each possible start index and compare characters until a mismatch or full match. O(n·m) time, where n is the haystack length and m is the needle length; O(1) extra space. |
| 35 | Search Insert Position | `solutions/src/P0035_SearchInsertPosition.java` | Easy | Binary search the sorted array. If the target is absent, return the left boundary as its insertion index. O(log n) time, O(1) space. |
| 58 | Length of Last Word | `solutions/src/P0058_LengthOfLastWord.java` | Easy | Scan from the end, skip trailing spaces, then count characters until the preceding space. O(n) time, O(1) space. |
| 66 | Plus One | `solutions/src/P0066_PlusOne.java` | Easy | Scan from the end, turning 9s into 0s and carrying. If every digit was 9, return a new array with a leading 1. O(n) time and O(n) space in the all-9s case. |
| 67 | Add Binary | `solutions/src/P0067_AddBinary.java` | Easy | Add bits from right to left with a carry. Append each result bit to a `StringBuilder`, then reverse it. O(max(n, m)) time and O(max(n, m)) space for the result. |
| 69 | Sqrt(x) | `solutions/src/P0069_Sqrt_x.java` | Easy | Binary search for the largest value where `mid <= x / mid`; division avoids overflow from `mid * mid`. O(log x) time, O(1) space. |
| 70 | Climbing Stairs | `solutions/src/P0070_ClimbingStairs.java` | Easy | Iterative DP: track the previous two counts in `a` and `b`, update them in one pass, and return `b`. O(n) time, O(1) space. |
| 83 | Remove Duplicates from Sorted List | `solutions/src/P0083_RemoveDuplicatesFromSortedList.java` | Easy | Traverse once with `current`. If adjacent nodes have equal values, skip the duplicate with `current.next = current.next.next`; otherwise, advance `current`. O(n) time, O(1) extra space. |
| 88 | Merge Sorted Array | `solutions/src/P0088_MergeSortedArray.java` | Easy | Merge from the back with three pointers, so no unread element of `nums1` is overwritten. Then copy any leftover `nums2` elements. O(m+n) time, O(1) extra space. |
| 94 | Binary Tree Inorder Traversal | solutions/src/P0094_BinaryTreeInorderTraversal.java | Easy | Recursive DFS: visit the left subtree, then the node, then the right subtree, collecting values into a shared list. O(n) time, O(h) space for the recursion stack. |
| 100 | Same Tree | solutions/src/P0100_SameTree.java | Easy | Recursive DFS on both trees together: both null is true, only one null or different values is false, otherwise both subtrees must match. O(n) time, O(h) space for the recursion stack. |
| 101 | Symmetric Tree | solutions/src/P0101_SymmetricTree.java | Easy | Recursive helper compares two subtrees as mirrors: outer pair (left.left, right.right) and inner pair (left.right, right.left). O(n) time, O(h) space for the recursion stack. |
| 104 | Maximum Depth of Binary Tree | `solutions/src/P0104_MaximumDepth.java` | Easy | Recursive DFS: an empty node has depth 0, otherwise the depth is 1 plus the larger of the two subtree depths. O(n) time, O(h) space for the recursion stack. |




## File Structure

Each file is named `P<number>_<ProblemName>.java`. The `P` prefix lets the class name start with a letter, as Java requires.

Files can include a `main` method with `Scanner` input for local testing and a problem-specific solution class. For LeetCode, submit the required method in the expected `Solution` class format; the local `main` method and input prompts are not needed there.

## Concepts Practiced

- Arrays and index handling
- Brute force and nested loops
- Reading input with `Scanner`
- HashMap lookups
- String traversal with `charAt` and `substring`
- Early exits from loops
- Stacks and matching bracket pairs
- Linked lists and reference manipulation
- Two-pointer techniques
- In-place array modification
- Binary addition, carry handling, `StringBuilder`, and reversing
- Binary search and integer square root
- Avoiding integer overflow with safe comparisons
- Binary tree traversal with recursion
- Comparing two binary trees node by node with recursion
- Checking symmetry by pairing mirrored nodes
- Dynamic programming with a rolling two-value state (Fibonacci recurrence)
- Computing tree height with recursion (1 + max of the two subtrees)
## Tech

- Language: Java
- IDE: IntelliJ IDEA

## Notes

The Approach column records each method and its time and space complexity. When I find a better solution to a problem, I update its row.

*Built while balancing college coursework and daily coding practice.*
