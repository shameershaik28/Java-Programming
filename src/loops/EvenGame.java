package loops;
/*
Problem: Even Game

Write a program to print all even numbers from 1 to N.

Take N as input from the user.

Note:
Use a while-loop or for-loop according to the session flow.
*/

import java.util.Scanner;

public class EvenGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++)
        {
            if(i % 2 == 0)
                System.out.print(i+ " ");
        }
    }
}
