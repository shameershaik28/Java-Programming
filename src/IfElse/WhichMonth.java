package IfElse;

import java.util.Scanner;

/*
Problem: Which Month?

Write a program to input an integer A from the user
and print the A-th month of the year.

Months list:
January, February, March, April, May, June,
July, August, September, October, November, December
*/
public class WhichMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        switch (A) {
            case 1:
                // code
                System.out.println("January");
                break;

            case 2:
                // code
                System.out.println("February");
                break;

            case 3:
                // code
                System.out.println("March");
                break;
            case 4:
                // code
                System.out.println("April");
                break;
            case 5:
                // code
                System.out.println("May");
                break;
            case 6:
                // code
                System.out.println("June");
                break;
            case 7:
                // code
                System.out.println("July");
                break;
            case 8:
                // code
                System.out.println("August");
                break;
            case 9:
                // code
                System.out.println("September");
                break;
            case 10:
                // code
                System.out.println("October");
                break;
            case 11:
                // code
                System.out.println("November");
                break;
            case 12:
                // code
                System.out.println("December");
                break;
        }
    }
}
