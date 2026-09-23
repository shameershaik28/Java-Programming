package DataTypes;

/*
Problem: Calculate Currency Change

Question:
Your friend Rahul plans to visit exotic countries all around the world.
Take the amount of money Rahul has before the currency exchange and
the amount of money that is spent from his savings as input.
Print the amount of money that remains in his savings.

Input Format:
The first line contains an integer N denoting the total savings,
the amount of money before exchange.

The second line contains an integer M denoting the exchanging amount,
denoting the amount of money that is spent from the savings.
*/

import java.util.Scanner;

public class CalculateCurrencyChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(N-M);
    }
}
