package loops;

import java.util.Scanner;

/*
Problem: First vs Last

Write a program that asks the user to input a number T,
indicating the number of test cases.

For each test case:
- Take a number N as input.
- Print the first digit and last digit of N.
*/
public class FirstVsLast {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0)
        {
            int N = sc.nextInt();
            int last = N % 10;
            int first = N;

            while(first>=10)
            {
                first = first/ 10;
            }

            System.out.println(first + " "+ last);
        }
    }
}
