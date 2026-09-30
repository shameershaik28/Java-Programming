package loops;

import java.util.Scanner;

/*
Problem: Sum the Digits

You are given T test cases.

For each test case, take an integer N as input
and calculate and print the sum of the digits of N.

Problem Constraints:
1 <= T <= 1000
0 <= N <= 100000000

Input Format:
The first line contains T, the total number of test cases.
Each of the next T lines contains an integer N.
*/
public class SumTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++)
        {
            int N = sc.nextInt();
            int sum = 0;

            while(N>0)
            {
                int last = N % 10;
                sum = sum + last;
                N = N/10;

            }

            System.out.println(sum);
        }
    }
}
