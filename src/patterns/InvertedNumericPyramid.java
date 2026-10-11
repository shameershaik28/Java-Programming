package patterns;

import java.util.Scanner;

/*
Problem: Inverted Numeric Pyramid

Take an integer N as input and print the corresponding
numeric inverted half pyramid pattern.

Example:
Input: N = 4

Output:
1 2 3 4
1 2 3
1 2
1
*/
public class InvertedNumericPyramid {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        for(int i=1; i<=N; i++)
        {

            for(int j=1; j<=N-i+1; j++)
            {
                System.out.print(j);

                if(j<N-i+1)
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
