package Functions;
/*
Problem: Factorial of N - Functions

Given a number N, return the factorial of N.

Factorial formula:
n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1

Example:
5! = 5 * 4 * 3 * 2 * 1 = 120

Corner Case:
0! = 1
*/
public class FactorialOfN {
    public int solve(int A) {
        int count = 1;
        for(int i=1; i<=A; i++)
        {
            count = count * i;
        }

        return count;
    }
}
