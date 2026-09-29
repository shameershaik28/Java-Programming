package loops;

/*
Problem: From Down to Top

Write a program to print all natural numbers from N to 1.

Take N as input from the user.
*/

import java.util.Scanner;

public class FromDownToTop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=N; i>=1; i--)
        {
            System.out.print(i+ " ");
        }
    }
}
