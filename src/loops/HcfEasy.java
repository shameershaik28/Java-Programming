package loops;

import java.util.Scanner;

/*
Problem: HCF - Easy

Write a program to input two integers A and B from the user
and print their HCF.

Definition:
The HCF (Highest Common Factor), also called GCD
(Greatest Common Divisor), of two positive integers
is the largest positive integer that divides both numbers
without leaving a remainder.
*/
public class HcfEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int a = A, b = B;

        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int hcf = a;
        System.out.print(a);
    }
}
