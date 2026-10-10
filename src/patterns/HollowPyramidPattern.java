package patterns;

import java.util.Scanner;
/*
Problem: Hollow Pyramid Pattern

Take an integer N as input and print the corresponding pattern.

Example:
Input: N = 5

Output:
*********
**     **
**     **
**     **
*       *

Note: Underscores in the problem statement represent spaces.
Print actual spaces in the output.
*/
public class HollowPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++)
        {
            for(int j=1; j<= N-i+1; j++)
            {
                System.out.print("*");
            }

            for(int j=1; j<= 2*(i-1); j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<= N-i+1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
