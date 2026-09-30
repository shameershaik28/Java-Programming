package loops;

import java.util.Scanner;

/*
Problem: Sum of Digits for T Numbers

Take T (number of test cases) as input.

For each test case, take an integer N as input
and print the sum of digits of that number.
*/
public class SumOfDigitsForTNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int sum = 0;

            while (N > 0) {
                int last = N % 10;
                sum += last;
                N = N / 10;
            }

            System.out.println(sum);
        }
    }
}
