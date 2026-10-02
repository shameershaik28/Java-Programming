package loops;

import java.util.Scanner;

/*
Problem: Sum Of Odd & Even Digits In A Number

You are given a number N.

Write a program to find:
- The sum of all odd digits in N
- The sum of all even digits in N

Print both sums.
*/
public class SumOfOddAndEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int odd= 0;
        int even = 0;


        while(A > 0)
        {
            int digit = A % 10;
            if(digit%2==0)
            {
                even += digit;
            }
            else
            {
                odd += digit;
            }

            A = A / 10;
        }


        System.out.println("Sum of Odd Digit : "+odd);
        System.out.println("Sum of Even Digit : "+even);

    }
}
