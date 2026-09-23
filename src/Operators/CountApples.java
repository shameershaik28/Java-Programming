package Operators;
/*
Problem: Count-Apples

Question:
Rahul has N apples initially, and Karan has M apples initially.
Rahul gave 5 apples to Karan.
After some time, Rahul plucked 2 times the initial number of apples (N) from the tree.

Find the total number of apples Rahul and Karan are left with.
*/

import java.util.Scanner;

public class CountApples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int gift = 5;
        N = N - gift + N * 2;
        M = M + gift;

        System.out.println( N +" "+ M);
    }
}
