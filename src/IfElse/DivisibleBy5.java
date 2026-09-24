package IfElse;

/*
Problem: Divisible By 5?

Question:
Given a number N:
- If the number is divisible by 5, print "Divisible by 5".
- Otherwise, print "Not divisible by 5".
*/

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N % 5 == 0)
        {
            System.out.println("Divisible by 5");
        }
        else
        {
            System.out.println("Not divisible by 5");
        }
    }
}
