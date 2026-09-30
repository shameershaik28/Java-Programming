package loops;

import java.util.Scanner;

/*
Problem: Check Palindrome for T Numbers

Take T (number of test cases) as input.

For each test case, take an integer N as input and check whether
that number is Palindromic or Not Palindromic.

A palindrome integer is an integer X for which:
reverse(X) = X

Example:
reverse(123) = 321

Note:
There will be no zeros at the start of a number.
*/
public class CheckPalindromeForTNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for(int i=0; i<T; i++)
        {
            int N = sc.nextInt();
            int reverse = 0;
            int orginal = N;

            while(N > 0)
            {
                int last = N % 10;
                reverse = reverse * 10 + last;
                N = N /10;

            }

            if(orginal == reverse)
            {
                System.out.println("Palindromic");
            }
            else
            {
                System.out.println("Not Palindromic");
            }
        }
    }
}
