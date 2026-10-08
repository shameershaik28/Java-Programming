package loops;

import java.util.Scanner;

/*
Problem: LCM - Easy

Implement a program that takes two positive integers A and B
as input and prints their LCM.

Definition:
The Least Common Multiple (LCM) of two numbers A and B
is the smallest positive integer that is divisible by both A and B.
*/
public class LcmEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int lcm= Math.max(A, B);

        while(lcm % A != 0 || lcm % B != 0)
        {
            lcm++;
        }

        System.out.print(lcm);
    }
}
