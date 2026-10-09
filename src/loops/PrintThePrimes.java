package loops;

import java.util.Scanner;

/*
Problem: Print the Primes!

You are given an integer N. Print all prime numbers between 1 and N.

Prime numbers are numbers that have exactly two factors:
1 and the number itself.

Example:
The first 5 prime numbers are 2, 3, 5, 7, and 11.
*/
public class PrintThePrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();



        for(int i=0; i<T; i++)
        {
            int N = sc.nextInt();
            int sum = 0;

            for(int j=1; j<N; j++)
            {
                if(N % j == 0)
                {
                    sum += j;
                }
            }
            if(sum == N)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }
    }
}
