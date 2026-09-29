package loops;
/*
Problem: Print All Digits - From Right To Left

Given a number N, print all the digits of the number
from right to left, each digit on a new line.
*/

import java.util.Scanner;

public class PrintAllDigitsFromRightToLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N == 0)
            System.out.println(N);

        if(N < 0)
            N = Math.abs(N);

        while(N > 0)
        {
            int lastDigitt = N % 10;
            System.out.println(lastDigitt);
            N = N/10;
        }
    }
}
