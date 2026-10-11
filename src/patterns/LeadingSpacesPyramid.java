package patterns;

import java.util.Scanner;

/*
Problem: Leading Spaces Pyramid

Take an integer N as input and print the corresponding pattern.

Example:
Input: N = 5

Output:
    *
   **
  ***
 ****
*****

Note: Underscores in the problem statement represent spaces.
Print actual spaces in the output.
*/
public class LeadingSpacesPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++)
        {
            for(int j=1; j<=N-i; j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
