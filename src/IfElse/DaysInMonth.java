package IfElse;

/*
Problem: Days In Month

You are given an integer A.

Tell how many days are there in the month denoted by A
in a non-leap year.

Months are denoted as follows:

January   : 1
February  : 2
March     : 3
April     : 4
May       : 5
June      : 6
July      : 7
August    : 8
September : 9
October   : 10
November  : 11
December  : 12
*/

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        switch(A) {
            case 1:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;
        }
    }

}
