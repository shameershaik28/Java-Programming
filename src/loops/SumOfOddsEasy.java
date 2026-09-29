package loops;
/*
Problem: Sum of Odds - Easy

Take an integer A as input.

Print the sum of all odd numbers in the range [1, A].
*/

import java.util.Scanner;

public class SumOfOddsEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=N; i +=2)
        {
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
