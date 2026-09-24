package IfElse;

import java.util.Scanner;

/*
Problem: Check even/odd

Question:
Write a program to input an integer from the user and print 1 if it is odd,
otherwise print 0.

Problem Constraints:
1 <= N <= 1000000

Input Format:
One line containing an integer N.
*/

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N % 2 == 0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(1);
        }
    }
}
