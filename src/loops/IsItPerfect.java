package loops;

import java.util.Scanner;

/*
Problem: Is It Perfect?

Given the number of test cases T, process each test case.

For each test case:
- Take an integer N as input.
- Determine whether N is a perfect number or not.

A perfect number is a positive integer equal to the sum
of its proper positive divisors, excluding the number itself.

A proper divisor divides a number without leaving any remainder.
*/
public class IsItPerfect {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // DO NOT USE ARGUMENTS FOR INPUTS
    // E.g. 'Scanner' for input & 'System.out' for output
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();



        for(int i=0; i<T; i++)
    {
        int N = sc.nextInt();
        int sum = 0;

        for(int j=1; j<N; j++)
        {
            if(N % j == 0)
            {
                sum += j;
            }
        }
        if(sum == N)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }
}
