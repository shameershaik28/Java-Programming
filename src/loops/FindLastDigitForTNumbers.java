package loops;

import java.util.Scanner;

/*
Problem: Find Last Digit for T Numbers

Take T (number of test cases) as input.

For each test case, take an integer N as input
and print the last digit of that number.
*/
public class FindLastDigitForTNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++)
        {
            int N = sc.nextInt();

            int last = N % 10;
            System.out.println(last);
        }
    }
}
