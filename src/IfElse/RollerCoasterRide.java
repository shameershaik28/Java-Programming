package IfElse;

/*
Problem: Roller Coaster Ride

Write a program that takes the age of the user as input and tells
whether they are old enough to ride a roller coaster.

The minimum age to ride the roller coaster is 13.

Input Format:
There is only 1 single line in the input, which is the age of the user.
*/

import java.util.Scanner;

public class RollerCoasterRide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 13)
        {
            System.out.println("You can ride the roller coaster!");
        }
        else
        {
            System.out.println("You can't ride the roller coaster.");
        }
    }
}
