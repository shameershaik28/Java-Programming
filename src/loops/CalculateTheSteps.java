package loops;

import java.util.Scanner;

/*
Problem: Calculate the Steps

Given a number N, determine how many times N must be divided
by 2 to get 1 as the final result.

Note: Try to solve this problem using a while loop.
*/
public class CalculateTheSteps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        while(N > 1)
        {
            N = N / 2;
            count++;
        }

        System.out.println(count);
    }
}
