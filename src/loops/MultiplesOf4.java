package loops;

/*
Problem: Multiples of 4

Given an integer input N, print all multiples of 4
less than or equal to N.
*/

import java.util.Scanner;

public class MultiplesOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=4; i<=N; i +=4)
        {
            System.out.print(i+ " ");
        }
    }
}
