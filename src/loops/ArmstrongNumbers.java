package loops;

import java.util.Scanner;

/*
Problem: Armstrong Numbers

Given an integer N, print all Armstrong numbers between 1 and N (inclusive).

A number is an Armstrong number if the sum of the cubes of its digits
is equal to the number itself.

Example:
153 = (1 * 1 * 1) + (5 * 5 * 5) + (3 * 3 * 3)

Note: All test cases are limited to 3-digit numbers.
*/
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        for(int i=1; i<=N; i++)
        {
            int temp = i;
            int sum = 0;

            while(temp > 0)
            {
                int last = temp % 10;
                sum += last * last * last;
                temp = temp / 10;
            }

            if(sum == i)
            {
                System.out.println(sum);
            }
        }
    }
}
