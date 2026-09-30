package loops;
/*
Problem: From Top to Down

Write a program that takes a positive integer N as input
from the user and prints all natural numbers from 1 to N.

Each number should be followed by a space, including the last number.
*/

import java.util.Scanner;

public class FromTopToDown2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++)
        {
            System.out.print(i+" ");
        }
    }
}
