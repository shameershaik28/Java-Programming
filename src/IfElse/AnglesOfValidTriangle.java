package IfElse;

/*
Problem: Angles Of Valid Triangle?

Question:
You are given 3 integer angles (in degrees) A, B, and C of a triangle.
Determine whether the triangle is valid or not.

A triangle is valid if the sum of its angles equals 180 degrees.

Note:
Take the input of 3 angles of the triangle from the user.
*/

import java.util.Scanner;

public class AnglesOfValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A+B+C == 180)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }
}
