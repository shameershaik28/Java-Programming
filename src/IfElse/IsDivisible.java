package IfElse;

/*
Problem: Is Divisible?

Question:
Given two numbers N and X.
If N is divisible by X, print "Yes".
Otherwise, print "No".
*/

import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        if(N % X == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
