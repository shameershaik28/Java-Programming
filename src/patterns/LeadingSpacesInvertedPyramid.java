package patterns;

import java.util.Scanner;

/*
Problem: Leading Spaces Inverted Pyramid

Given an integer N, print an inverted pyramid pattern of stars
with leading spaces.

The first row contains N stars. Each subsequent row contains
one fewer star and one additional leading space.

Example:
Input: N = 5

Output:
*****
 ****
  ***
   **
    *
*/
public class LeadingSpacesInvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++)
        {
            for(int j=1; j<=i-1; j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=N-i+1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
