package patterns;

import java.util.Scanner;

/*
Problem: Print N Stars

Given an integer N, print N stars in a single line.

Example:
Input: N = 5
Output: *****
*/
public class PrintNStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i =1; i<=N; i++)
        {
            System.out.print("*");
        }
    }
}
