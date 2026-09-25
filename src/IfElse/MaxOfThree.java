package IfElse;
/*
Problem: Max of Three

Write a program to input three numbers (A, B & C) from the user
and print the maximum element among A, B & C.

Problem Constraints:
1 <= A <= 1000000
1 <= B <= 1000000
1 <= C <= 1000000

Input Format:
First line is a single integer A.
Second line is a single integer B.
Third line is a single integer C.
*/

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max;

        if(A > B)
        {
            max = A;
        }
        else
        {
            max = B;
        }

        System.out.println(Math.max(max, C));
    }
}
