Error conditions
For this assignment, when you detect an error condition, call IO.reportBadInput() and ask for the input again.

Problems
Problem 1
Write your code in the file Scores.java. Write your test cases in assign2.txt.

In many Olympic sports, an athlete is given scores by a panel of judges. Scores can range from 0.0 (awful) to 10.0 (perfect). To ensure fairness, the highest and lowest scores are dropped, and the remaining scores are averaged to produce the athlete's overall score.

Ask the user for the following information, in this order:

The number of judges on the panel (an integer).
The score given by each judge, one by one (real numbers).
Compute the average of all scores except the highest and lowest (a real number). If two or more judges give the same lowest score, only one should be dropped (the same principle applies to ties for the highest score).

Example:

java Scores

4 [this is the number of judges, not a score]
-4.3
User entered bad input.
3.7
4.9
11.0
User entered bad input.
10.5
User entered bad input.
10.0
4.3

RESULT: 4.6
Problem 2
Write your code in the file TwoSmallest.java. Write your test cases in assign2.txt.

We wish to write a program that takes a set of numbers and determines which are the two smallest.

Ask the user for the following information, in this order:

A terminating value (real number). The user will enter this value again later, to indicate that he or she is finished providing input.
A sequence of real numbers. Keep asking for numbers until the terminating value is entered.
Compute and output the smallest and second-smallest real number, in that order. It is possible for the smallest and second-smallest numbers to be the same (if the sequence contains duplicate numbers).

Example:

java TwoSmallest

123 [this is the terminating value, not part of the set of numbers]
17
23.5
10
15.2
30
8
16
123 [this is the terminating value again, indicating that the user is done]

RESULT: 8.0
RESULT: 10.0
Problem 3
Write your code in the file NthPrime.java. Write your test cases in assign4-testcases.txt.

A prime number is one that has no divisors other than 1 and itself (no other number divides evenly into the prime number). The 1st (smallest) prime number is 2. The 2nd is 3, the 3rd is 5, etc.

Ask the user for a value n, and compute the nth prime number. You must perform this computation using loops. You MAY NOT hardcode a list of prime numbers into your program.

Examples:

java NthPrime

10

RESULT: 29 
