package loops;

import java.util.Scanner;

/*
Problem: Sum of Odd and Even Index Digits in a Number

Given a number N, find the sum of digits at odd indices
and the sum of digits at even indices.

Note:
Indexing starts from 1 and is counted from right to left.
*/
public class SumOfOddAndEvenIndexDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int even = 0;
        int odd = 0;
        int index = 1;

        while (N > 0) {
            int digit = N % 10;
            if (index % 2 == 0) {
                even += digit;
            } else
                odd += digit;

            N = N / 10;
            index++;
        }

        System.out.println("Sum of Odd Index Digit : " + odd);
        System.out.println("Sum of Even Index Digit : " + even);

    }
}