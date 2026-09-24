package IfElse;
/*
Problem: Rockstar

Given a number N, print the answer according to the following rules:

1. If N is divisible by 3, print "Rock"
2. If N is divisible by 5, print "star"
3. If N is divisible by both 3 and 5, print "Rockstar"

Note:
You are allowed to use only if conditions.
Do not use else or else-if conditions.
*/

import java.util.Scanner;

public class Rockstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N % 3 == 0)
        {
            System.out.print("Rock");
        }

        if(N % 5 == 0)
        {
            System.out.print("star");
        }
    }
}
