package IfElse;

/*
Problem: Bank Account

You are given a bank account having N amount.

You are asked to perform either:
- ADD (credit) an amount X
- SUBTRACT (debit) an amount X

After the operation, print the amount left in the bank account.

If the debit amount is greater than the current account balance,
handle the operation according to the problem's given condition.
*/

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int type = sc.nextInt();
        int X= sc.nextInt();

        int sum;


        if(type == 1)
        {
            sum = N + X;
            System.out.println(sum);
        }
        else
        {
            sum = N - X;
            if(X > N )
            {
                System.out.println("Insufficient Funds");

            }
            else
            {
                System.out.println(sum);
            }
        }
    }
}
