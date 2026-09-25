package IfElse;

/*
Problem: Which Triangle?

Write a program to input three numbers (A, B & C) representing
the side lengths of a triangle.

Print whether the triangle is:
- "equilateral"
- "scalene"
- "isosceles"

Problem Constraints:
1 <= A <= 100000
1 <= B <= 100000
1 <= C <= 100000

Note:
It is guaranteed that the given sides form a valid triangle.

Input Format:
One line containing three space-separated integers A, B & C.
*/

import java.util.Scanner;

public class WhichTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && B == C) {
            System.out.println("equilateral");
        }
        else if (A != B && B != C && A != C)
        {
            System.out.println("scalene");
        }
        else{
            System.out.println("isosceles");
        }
    }
}
