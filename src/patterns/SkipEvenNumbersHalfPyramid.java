package patterns;

import java.util.Scanner;

/*
Problem: Skip Even Numbers Half Pyramid

Take an integer N as input and print the corresponding pattern.

Example:
Input: N = 5

Output:
1
1
1 3
1 3
1 3 5

Note: Underscores in the problem statement represent spaces.
Print actual spaces in the output.
*/
public class SkipEvenNumbersHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        for(int i=1; i<=N; i++)
        {
            for (int j = 1; j <= i; j++) {

                if (j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}
