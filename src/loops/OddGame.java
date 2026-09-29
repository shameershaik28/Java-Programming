package loops;
/*
Problem: Odd Game

Write a program to print all odd numbers from 1 to N.

N is inclusive.

Note:
Each number should be followed by a space, including the last number.
*/

import java.util.Scanner;

public class OddGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i+=2)
        {
            System.out.print(i+" ");
        }
    }
}
