package IfElse;

import java.util.Scanner;
/*
Problem: Situation Of Number

Check whether a given number is:
- Positive-Odd
- Positive-Even
- Negative-Odd
- Negative-Even

Take a number N as input and print the Situation Of Number.

If positive-odd:
Print -> "Number is Positive and Odd"

If positive-even:
Print -> "Number is Positive and Even"

If negative-odd:
Print -> "Number is Negative and Odd"

If negative-even:
Print -> "Number is Negative and Even"
*/

public class SituationOfNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N  > 0 )
        {
            if(N % 2 == 0 )
            {
                System.out.println("Number is Positive and Even");
            }
            else{
                System.out.println("Number is Positive and Odd");
            }
        }
        else
        {
            if(N % 2 == 0)
            {
                System.out.println("Number is Positive and Even");
            }
            else{
                System.out.println("Number is Negative and Odd");
            }
        }
    }
}

