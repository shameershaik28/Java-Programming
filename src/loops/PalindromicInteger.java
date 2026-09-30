package loops;

import java.util.Scanner;

/*
Problem: Palindromic Integer

You are given an integer A as input.

Determine whether A is a palindrome or not.

A palindrome integer is one whose digits, when reversed,
result in the same number.

Example:
121 is a palindrome because its reverse is also 121.
123 is not a palindrome because its reverse is 321.

Note:
The given integer will not have any leading zeros.
*/
public class PalindromicInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int reverse = 0;
        int orginal = A;

        while(A > 0)
        {
            int last = A % 10;
            reverse = reverse * 10 + last;
            A = A / 10;
        }

        if(orginal == reverse)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }

    }
}
