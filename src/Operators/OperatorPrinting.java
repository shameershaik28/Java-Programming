package Operators;
/*
Problem: Operator Printing

Question:
Take three numbers from the user: n1, n2, and n3.

Print the following:

1. "Number 1 is " followed by n1.
2. "Number 2 is " followed by n2.
3. "Number 3 is " followed by n3.
4. "(n1 > n2) condition is " followed by the boolean result of (n1 > n2).
5. "(n2 <= n3) condition is " followed by the boolean result of (n2 <= n3).
6. "(n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is " followed by the
   boolean result of (n1 < n2) || ((n2 == n3) && (n1 < n3)).
*/

import java.util.Scanner;

public class OperatorPrinting {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);
        System.out.println("(n1 > n2) condition is " + (n1 > n2));
        System.out.println("(n2 <= n3) condition is " + (n2 <= n3));
        System.out.println("(n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is " + ((n1 < n2) || (n2 == n3) && (n1<n3)));
    }
}
