package loops;
/*
Problem: Last Digit Of A Number

Given a number N, print the last digit of the number.
*/

import java.util.Scanner;

public class LastDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(N%10);
    }
}
