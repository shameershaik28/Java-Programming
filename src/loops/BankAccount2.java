package loops;

import java.util.Scanner;

/*
Problem: Bank Account - 2

You are given a bank account with an initial balance of N.

Perform two types of operations:

- ADD: Increases the account balance by the given amount.
  Print the updated balance after the operation.

- SUBTRACT: Decreases the account balance by the given amount.
  Print the updated balance after the operation.

If the amount to subtract is greater than the current balance,
print "Insufficient Funds" instead.

In case of insufficient funds, skip the operation and keep
the account balance unchanged.

Note:
The initial amount N and the transaction amounts can be large numbers.
*/
public class BankAccount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        int M = sc.nextInt();

        while (M-- > 0) {
            int type = sc.nextInt();
            long X = sc.nextLong();

            if (type == 1) {
                N = N + X;
                System.out.println(N);
            } else {
                if (X > N) {
                    System.out.println("Insufficient Funds");
                } else {
                    N = N - X;
                    System.out.println(N);
                }
            }
        }
    }
}
