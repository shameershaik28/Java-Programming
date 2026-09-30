package loops;

import java.util.Scanner;

/*
Problem: Find Reverse Number

Given a number N, print the reversed number.

Note:
Create a new reverse number instead of printing the number
from right to left.
*/
public class FindReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int reverse = 0;
        boolean neg = false;

        if(N < 0)
        {
            neg = true;
            N = N * -1;
        }

        while(N > 0)
        {
            int last = N % 10;
            reverse = reverse * 10 + last;
            N = N /10;
        }
        if(neg == true)
        {
            reverse = reverse * -1;
        }
        System.out.print(reverse);
    }
}
