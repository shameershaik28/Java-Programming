package IfElse;
/*
Problem: Situation Of Person

Question:
Given the temperature of a person, analyse the situation of the person
and give advice based on the following conditions:

1. [85.0 to 91.0]   -> "Serious Hypothermia"
2. (91.0 to 95.0)   -> "Mild Hypothermia"
3. [95.0 to 98.0]   -> "Normal Temperature"
4. (98.0 to 100.0]  -> "Mild Fever"
5. (100.0 to 105.0] -> "High Fever"

Notes:
- The temperature ranges are hypothetical.
- [] means inclusive.
- () means exclusive.
- Try to solve using multiple if statements.
*/

import java.util.Scanner;

public class SituationOfPerson {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();

        if(temp >=85.0 && temp <=91.0)
        {
            System.out.println("Serious Hypothermia");
        }
        else if(temp > 91.0 && temp < 95.0)
        {
            System.out.println("Mild Hypothermia");
        }
        else if(temp >= 95.0 && temp <= 98.0)
        {
            System.out.println("Normal Temperature");
        }
        else if(temp > 98.0 && temp <= 100.0)
        {
            System.out.println("Mild Fever");
        }
        else if(temp > 100.0 && temp <= 105.0)
        {
            System.out.println("High Fever");
        }
    }
}
