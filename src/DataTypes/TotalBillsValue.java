package DataTypes;

/*
Problem: Total Bills Value

Question:
Given the value of a single bill and the number of bills you received,
print the total value of the bills.

Note:
The value of all the bills are the same.
*/

import java.util.Scanner;

public class TotalBillsValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(N*M);
    }

}
