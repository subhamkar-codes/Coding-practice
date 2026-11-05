# LeetCode Solutions (Java)

Solutions to LeetCode problems, solved in Java while building problem-solving skills for DSA.

## Solved Problems

| # | Problem | File | Difficulty | Approach |
|---|---------|------|------------|----------|
| 1 | Two Sum | `P0001_TwoSum.java` | Easy | Brute force: check every pair (i, j) with j > i. O(n²) time, O(1) space. |
| 9 | Palindrome Number | `P0009_PalindromeNumber.java` | Easy | Reverse the digits using `% 10` and `/ 10` (no string conversion) and compare with the original. Negatives return false. A `long` holds the reversed value to avoid overflow. O(log n) time, O(1) space. |

## File Structure

Each file is named `P<number>_<ProblemName>.java`. The `P` prefix is there because Java class names can't start with a digit.

Every file has two parts:

- **Local test version:** a `main` method that reads input with `Scanner`, so I can run and debug the logic myself.
- **LeetCode submission:** the `Solution` class in the format LeetCode expects, kept as a comment at the bottom for copy-pasting.

## Concepts Practiced

- Arrays and index handling
- Nested loops
- Reading array input with `Scanner`

## Tech

- Language: Java
- IDE: IntelliJ IDEA

## Notes

The Approach column records the method and its time and space complexity. When I find a better solution to a problem, I update its row.

*Built while balancing college coursework and daily coding practice.*
