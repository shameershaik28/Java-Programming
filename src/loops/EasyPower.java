package loops;

/*
Problem: Easy Power

You are given two integers A and B.

Find the value of A^B.

Note:
The value of A^B will always be less than or equal to 10^9.

Problem Constraints:
1 <= A, B <= 1000

Input Format:
First line of the input contains a single integer A.
Second line of the input contains a single integer B.
*/

import java.util.Scanner;

public class EasyPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();

        int sum  = 1;

        for(int i=1; i<=B; i++)
        {
            sum *= A;
        }
        System.out.println(sum);
    }
}
