package DataTypes;

import java.util.Scanner;

/*
Problem: Overflow Multiplication

Question:
Given two numbers A and B. Multiply them and print the product.
*/

public class OverflowMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        long product = (long)A * B;
        System.out.println(product);
    }
}
