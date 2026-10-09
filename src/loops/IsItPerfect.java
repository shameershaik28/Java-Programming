package loops;

import java.util.Scanner;

/*
Problem: Is It Perfect?

Given the number of test cases T, process each test case.

For each test case:
- Take an integer N as input.
- Determine whether N is a perfect number or not.

A perfect number is a positive integer equal to the sum
of its proper positive divisors, excluding the number itself.

A proper divisor divides a number without leaving any remainder.
*/
public class IsItPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        for(int i=1; i<=N; i++)
        {
            int count  = 0;
            for(int j=1; j<=N; j++)
            {
                if(i % j == 0)
                {
                    count++;
                }
            }

            if(count == 2)
            {
                System.out.println(i);
            }
        }
    }
}
