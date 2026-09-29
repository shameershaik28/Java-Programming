package loops;

/*
Problem: Summation Game

Write a program to find the sum of all natural numbers from 1 to N.

Take N as input from the user.
*/

import java.util.Scanner;

public class SummationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum  = 0;

        for(int i=1; i<=N; i++)
        {
            sum +=i;
        }
        System.out.println(sum);
    }
}
