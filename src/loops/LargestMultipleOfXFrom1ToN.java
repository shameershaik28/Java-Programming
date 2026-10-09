package loops;

import java.util.Scanner;

/*
Problem: Largest Multiple of X from 1 to N

Given two numbers N and X, print the largest multiple of X
in the range from 1 to N.

Multiple:
If A % B == 0, then A is a multiple of B.
*/
public class LargestMultipleOfXFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int largest = 0;

        for(int i=1; i<=N; i++)
        {
            if(i%X==0)
            {
                largest = i;
            }
        }

        System.out.println(largest);
    }
}
