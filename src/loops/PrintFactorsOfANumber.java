package loops;

import java.util.Scanner;

/*
Problem: Print Factors of a Number

Take an integer N as input and print its factors.

A factor of a number is a number that divides it perfectly,
leaving no remainder.

Example:
1, 2, 3, and 6 are factors of 6.
*/
public class PrintFactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++)
        {
            if(N%i==0)
                System.out.print(i+" ");
        }
    }
}
