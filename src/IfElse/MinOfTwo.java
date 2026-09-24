package IfElse;
/*
Problem: Min of Two

Question:
Write a program to input two numbers (A & B) from the user
and print the minimum element among A & B in each line.
*/

import java.util.Scanner;

public class MinOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(Math.min(A, B));
    }
}
