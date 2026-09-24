package IfElse;

/*
Problem: Divisible by 2 numbers

Take an integer A as input.

Determine whether A is divisible by both 5 and 11 or not.
*/

import java.util.Scanner;

public class DivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A  = sc.nextInt();

        if(A % 5 ==0 && A % 11 == 0)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }
}
