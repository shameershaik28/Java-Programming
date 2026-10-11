package patterns;

import java.util.Scanner;

/*
Problem: Numeric Stair Pattern

Take an integer N as input and print the corresponding pattern.

Example:
Input: N = 4

Output:
1
1 2
1 2 3
1 2 3 4

Note: There should be no extra spaces after the last integer
in each row.
*/
public class NumericStairPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++)
        {

            for(int j=1; j<=i; j++)
            {

                System.out.print(j);
                if(j<i)
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
