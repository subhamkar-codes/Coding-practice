# CodeChef: 500 to 1000 Difficulty Rating (Java)

Solutions to the CodeChef practice course for the **500 to 1000 difficulty rating** range, written in Java.

This follows my earlier folder, which covered the 500-rated warm-up set. Here the problems get slightly harder: more conditions, arithmetic edge cases, and early loop and array work.

**Progress:** 5 / 156 solved

---

## Problems

| # | Problem | File | Rating | Concept |
|---|---------|------|--------|---------|
| 1 | Greater Average | [GreaterAverage.java] | 500 | Average of two values, int vs double division, strict inequality |
| 2 | Subscriptions | [Subscriptions.java] | 504 | Ceiling division using only integers |
| 3 | Janmansh and Assignments | [JanmanshAndAssignments.java]| 513 | Comparing a finish time with a deadline, `<=` boundary |
| 4 | Exams | [Exams.java]| 519 | Percentage threshold, integer vs double comparison |
| 5 | Chef in his Office | [ChefInHisOffice.java]| 532 | Weekly total arithmetic |
| 6 | Mahasena | Mahasena.java | 720 | counting even and odd values in an array, comparing counts |
| 7 | CRED Coins | CREDCoins.java | 539 | integer division, bags from a coin total |
| 8 | Water Filling | WaterFilling.java | 541 | counting empty bottles, simplifying branch conditions |
| 9 | Sale Season | SaleSeason.java | 541| if else and boundry check |
| 10 | Sale Season | SaleSeason.java | 541 | tiered discounts, boundary conditions with < and <= |
| 11 | Chefland Games | CheflandGames.java | 550 | logical AND, checking that all conditions hold |
| 12 | Expert Setter | ExpertSetter.java | 561 | percentage threshold, avoiding double |
| 13 | Chef and NextGen | ChefAndNextGen.java | 562 | product comparison, int range |
| 14 | Sugarcane Juice Business | SugarcaneJuiceBusiness.java | 563 | percentage arithmetic with integers |
| 15 | Count the Notebooks | CountTheNotebooks.java | 563 | unit conversion, integer arithmetic |
| 16 | Chef and Candies | ChefAndCandies.java | 570 | ceiling division with a zero-floor check |
| 17 | Car or Bike | CarOrBike.java | 571 | three-way comparison |


New rows are added in batches, only for problems that are marked solved on CodeChef.

---

## Concepts practised

- Reading `T` test cases with `Scanner` and a `for` loop
- `if / else` with strict (`>`) and inclusive (`>=`, `<=`) boundaries
- Integer division and ceiling division, `(n + k - 1) / k`
- Why integer comparisons are safer than `double` comparisons
- Naming values (`int fullDays = 4;`) instead of leaving magic numbers in expressions

This list grows only when a new idea comes up, not with every problem.

---

## How I work on each problem

1. Read the constraints first, since they hint at the expected approach.
2. Solve it, then trace the sample inputs by hand.
3. Clean it up: variable names that match the problem, no redundant conditions, `Math.min` / `Math.max` where they fit, and consistent formatting.
4. Check for hidden risks (precision with `double`, boundary values, `int` overflow).
5. Add the row to the table once the problem is marked solved.

---

## Code style

- Class and file names in `PascalCase` that match the problem name
- Variable names taken from the problem statement (`n`, `x`, `y`, `z`, or descriptive names)
- Output format is kept consistent within a file (`Yes` / `No`)
- Formatted with IntelliJ's reformat command before committing

---

## Running a solution

Each file has its own `main` method and reads from standard input.

```bash
javac src/GreaterAverage.java
java -cp src GreaterAverage
```


In IntelliJ, use the green run arrow next to the class name.
---


## Notes

- Problems are CodeChef's, linked by title on the platform. This repo only holds my own solutions.
- Some early solutions use `double` where integers are enough. I'm rewriting those with integer-only versions as I learn why.
- Related folders in this repo: CodeChef (500 difficulty rating), LeetCode, HackerRank.
