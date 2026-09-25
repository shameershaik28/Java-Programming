package IfElse;
/*
Problem: Fizz Buzz

Write a program that takes a number N as input and does the following:

- If N is a multiple of 3, print "Fizz"
- If N is a multiple of 5, print "Buzz"
- If N is a multiple of both 3 and 5, print "FizzBuzz"
*/

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N % 3 ==0 && N % 5 == 0)
        {
            System.out.println("FizzBuzz");
        }
        else if(N % 3 ==0)
        {
            System.out.println("Fizz");
        }
        else if(N % 5 ==0)
        {
            System.out.println("Buzz");
        }
    }
}
