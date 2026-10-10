package patterns;

import java.util.Scanner;
/*
Problem: Stair Pattern

Take an integer N as input and print the corresponding
stair pattern containing N rows.

Example:
Input: N = 4

Output:
*
**
***
****
*/
public class StairPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 0;


        for(int i=0; i<N; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
