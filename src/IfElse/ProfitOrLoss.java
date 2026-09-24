package IfElse;

/*
Problem: Profit Or Loss

Question:
You are given the Cost Price (C) and Selling Price (S) of a product.
Determine whether there is a Profit or Loss and calculate the total
profit or loss.

Note:
- Cost Price and Selling Price are guaranteed to be different.
- Take Cost Price (C) and Selling Price (S) as input from the user.
*/

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int S = sc.nextInt();

        if(C < S)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(-1);
        }

        System.out.println(Math.abs(C-S));
    }
}
