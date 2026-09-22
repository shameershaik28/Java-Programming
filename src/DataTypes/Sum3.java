package DataTypes;

/*
Problem: Sum 3

Question:
Given three numbers A, B and C. Add them and print the sum.

Input Format:
Three space-separated integers A, B, and C in the first line.

Output Format:
Print in a single line the sum of A, B, and C.
*/

import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(A+B+C);
    }
}
