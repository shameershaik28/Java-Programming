package Operators;

/*
Problem: Problem With Younger Brother

Question:
Write a program that adds two numbers, divides their sum by a third number,
and prints the remainder.
*/

import java.util.Scanner;

/*
Problem: Problem With Younger Brother

Question:
Write a program that adds two numbers, divides their sum by a third number,
and prints the remainder.
*/

public class ProblemWithYoungerBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();

        long add = (long) N1 + N2;

        System.out.println(add % N3);

    }
}
