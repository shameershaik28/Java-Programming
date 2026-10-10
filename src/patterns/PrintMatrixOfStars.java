package patterns;

import java.util.Scanner;

/*
Problem: Print a Matrix of Stars

Given two integers N and M, print a rectangle consisting
of N rows and M stars in each row.

Example:
Input: N = 3, M = 4

Output:
****
****
****
*/
public class PrintMatrixOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();


        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M ; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
