package IfElse;

/*
Problem: Max of Two

Question:
Write a program to input two numbers (A and B) from the user
and print the maximum element among A and B.
*/

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if( A > B )
        {
            System.out.println(A);
        }
        else
        {
            System.out.println(B);
        }
    }
}
