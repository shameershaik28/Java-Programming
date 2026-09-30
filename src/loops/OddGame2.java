package loops;

import java.util.Scanner;

/*
Problem: Odd Game

Write a program to print all odd numbers from 1 to N.

N is inclusive.

Take N as input from the user.
*/
public class OddGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i +=2)
        {
            System.out.print(i+" ");
        }
    }
}
