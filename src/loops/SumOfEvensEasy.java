package loops;
/*
Problem: Sum of Evens - Easy

You are given a positive integer A.

Print the sum of all even numbers in the range [1, A].
*/

import java.util.Scanner;

public class SumOfEvensEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int sum  = 0;

        for(int i=2; i<=A; i +=2)
        {
            sum = sum + i;
        }

        System.out.print(sum);
    }
}
