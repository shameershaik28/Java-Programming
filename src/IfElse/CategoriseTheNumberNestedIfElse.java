package IfElse;
/*
Problem: Categorise the Number - Nested if-else

Given a number N, categorise the number according to the following conditions:

1. Odd-Positive
2. Odd-Negative
3. Even-Positive
4. Even-Negative
*/

import java.util.Scanner;

public class CategoriseTheNumberNestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N > 0)
        {
            if( N % 2 == 0)
            {
                System.out.println("Even-Positive");
            }
            else{
                System.out.println("Odd-Positive");
            }
        }
        else
        {
            if( N % 2 != 0)
            {
                System.out.println("Odd-Negative");
            }
            else{
                System.out.println("Even-Negative");
            }
        }
    }
}
