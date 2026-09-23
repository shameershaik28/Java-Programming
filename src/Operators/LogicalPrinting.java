package Operators;

/*
Problem: Logical Printing

Question:
Take three numbers from the user: n1, n2, and n3.

Print the following:

1. "Number 1 is " followed by n1.
2. "Number 2 is " followed by n2.
3. "Number 3 is " followed by n3.
4. "(n1 < n2) condition is " followed by the boolean result of (n1 < n2).
5. "(n2 == n3) condition is " followed by the boolean result of (n2 == n3).
6. "(n1 < n2) && (n2 == n3) condition is " followed by the boolean result of
   (n1 < n2) && (n2 == n3).
*/

import java.util.Scanner;

public class LogicalPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();

        System.out.println("Number 1 is " + N1);
        System.out.println("Number 2 is " + N2);
        System.out.println("Number 3 is " + N3);

        System.out.println("(n1 < n2) condition is " + (N1<N2));
        System.out.println("(n2 == n3) condition is " + (N2==N3));
        System.out.println("(n1 < n2) && (n2 == n3) condition is " + ((N1<N2) && (N2 == N3)));

    }
}
