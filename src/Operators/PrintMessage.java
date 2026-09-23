package Operators;

/*
Problem: Print-Message

Question:
Write a program to take two inputs from the user:
1. String (S)
2. Integer (N)

Print the integer value followed by the string value in the same line.
*/

import java.util.Scanner;

public class PrintMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = sc.nextInt();

        System.out.println(N + " " + S);
    }
}
