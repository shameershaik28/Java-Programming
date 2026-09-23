package DataTypes;
/*
Problem: Number of Bills

Question:
Given total bills amount and amount of a single bill.
Print the number of bills.
*/

import java.util.Scanner;

public class NumberOfBills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N= sc.nextDouble();
        int M = sc.nextInt();
        int sum = (int) N / M;

        System.out.println(sum);
    }
}
