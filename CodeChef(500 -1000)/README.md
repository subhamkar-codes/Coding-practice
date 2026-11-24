# CodeChef: 500 to 1000 Difficulty Rating (Java)

Solutions to the CodeChef practice course for the **500 to 1000 difficulty rating** range, written in Java.

This follows my earlier folder, which covered the 500-rated warm-up set. Here the problems get slightly harder: more conditions, arithmetic edge cases, and early loop and array work.

**Progress:** 40 / 156 solved

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
| 18 | Is the Score Consistent | IsTheScoreConsistent.java | 572 | values that can only increase, two conditions with && |
| 19 | The Three Topics | TheThreeTopics.java | 573 | membership check with ||, single test case |
| 20 | Monopoly | Monopoly.java | 578 | comparing each value with the sum of the others |
| 21 | Problems in your to-do list | ProblemsInYourToDoList.java | 580 | counting values over a limit, resetting a counter per test case |
| 22 | Air Conditioner Temperature | AirConditionerTemperature.java | 584 | overlapping ranges, max of lower bounds against an upper bound |
| 23 | Nearest Exit | NearestExit.java | 585 | nearest of two ends, edge case at the midpoint |
| 24 | Reverse The Number | ReverseTheNumber.java | 420 | reversing digits with `% 10` and `/ 10` |
| 25 | Good Program | GoodProgram.java | 593 | divisibility check with `%` |
| 26 | Qualify the round | QualifyTheRound.java | 594 | weighted score against a threshold |
| 27 | Sasta Shark Tank | SastaSharkTank.java | 592 | comparing percentage valuations with integers, three-way comparison |
| 28 | Elections in Chefland | ElectionsInChefland.java | 604 | counting values at or above a minimum, resetting a counter per test case |
| 29 | Minimum Cars required | MinimumCarsRequired.java | 608 | ceiling division with integers |
| 30 | Test Score | TestScore.java | 610 | divisibility check combined with an upper bound using `&&` |
| 31 | Jenga Night | JengaNight.java | 613 | divisibility check for an even split |
| 32 | Bus Seat Numbering | BusSeatNumbering.java | 613 | classifying a value into ranges with an `else if` chain |
| 33 | Discus Throw | DiscusThrow.java | 622 | finding the maximum of three values |
| 34 | Maximise the Tastiness | MaximiseTheTastiness.java | 627 | `Math.max` on each pair, then summing |
| 35 | Watching Movies at 2x | WatchingMoviesAt2x.java | 628 | time arithmetic with integer division, using the guarantee that Y is even |
| 36 | Police and Thief | PoliceAndThief.java | 639 | distance between two points with `Math.max` and `Math.min` |
| 37 | Flip the cards | FlipTheCards.java | 641 | minimum of two counts |
| 38 | Bath in Winters | BathInWinters.java | 643 | integer division for "how many fit" |
| 39 | Finding Shoes | FindingShoes.java | 646 | clamping a value at zero with `Math.max(0, ...)` |
| 40 | Small factorials | SmallFactorials.java | 420 | `BigInteger` for values that overflow `long` |
| 41 | Mario and Transformation | MarioAndTransformation.java | 649 | repeating cycle of length 3 with `%` |
| 42 | Mario and Bullet | MarioAndBullet.java | 650 | time from distance and speed, clamping at zero with `Math.max(0, ...)` |
| 43 | Chess Ratings | ChessRatings.java | 651 | ceiling division with integers |
| 44 | Complementary Strand in a DNA | ComplementaryStrandInADNA.java | 660 | character mapping with `StringBuilder` |
| 45 | Chef and Water Bottles | ChefAndWaterBottles.java | 662 | integer division capped by a limit |
| 46 | Candy Distribution | CandyDistribution.java | 668 | divisibility plus an even-share check with `%` |
| 47 | The Last Levels | TheLastLevels.java | 679 | counting breaks between groups of 3, with no break after the last level |
| 48 | Blackjack | Blackjack.java | 681 | finding a missing value, using the constraints to skip a bound check, with a helper method |
| 49 | Fill Candies | FillCandies.java | 681 | ceiling division with integers |
| 50 | Finding Square Roots | FindingSquareRoots.java | 420 | `Math.sqrt` with an `(int)` cast to round down |

New rows are added in batches, only for problems that are marked solved on CodeChef.

---

## Concepts practised

- Reading `T` test cases with `Scanner` and a `for` loop
- `if / else` with strict (`>`) and inclusive (`>=`, `<=`) boundaries
- Integer division and ceiling division, `(n + k - 1) / k`
- Why integer comparisons are safer than `double` comparisons
- Naming values (`int fullDays = 4;`) instead of leaving magic numbers in expressions
- Maximum and minimum with `Math.max` and `Math.min`
- Clamping a value at zero
- Big numbers with `BigInteger`
- Repeating cycles with the modulo operator
- Building strings with `StringBuilder`
- Splitting logic into a helper method outside `main`
- Built-in math functions with casts
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
