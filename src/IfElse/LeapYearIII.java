package IfElse;

/*
Problem: Leap Year III

Given an integer A representing a year, return 1 if it is a leap year,
otherwise return 0.

A year is a leap year if:
- The year is a multiple of 400.
- Otherwise, the year is a multiple of 4 and not a multiple of 100.
*/

import java.util.Scanner;

public class LeapYearIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if( A % 400 == 0 || (A % 4 ==0 && A % 100 !=0))
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }
}
