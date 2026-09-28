package IfElse;

/*
Problem: Find Largest of Three

Mr. ST is playing a game. There is a bucket containing 3 slips.

Check all three slips and print the slip containing the maximum number.
*/

import java.util.Scanner;

public class FindLargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();

        int num = Math.max( N1, Math.max(N2, N3));
        System.out.println(num+" is largest number");

    }
}
