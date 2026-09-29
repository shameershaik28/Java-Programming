package loops;

/*
Problem: Print Even Numbers from N to 0

Write a program to print all even numbers from N to 0.

Take N as input from the user.
*/

import java.util.Scanner;

public class PrintEvenNumbersFromNTo0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=N; i>=0; i--)
        {
            if(i%2==0)
                System.out.print(i+" ");
        }
    }
}
