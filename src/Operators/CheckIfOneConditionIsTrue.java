package Operators;
/*
Problem: Check If One Condition is True

Question:
Take three numbers from the user: n1, n2, and n3.

Print:
1. "Number 1 is " followed by n1.
2. "Number 2 is " followed by n2.
3. "Number 3 is " followed by n3.

Then print "true" if at least one of the following conditions is true:
1. n1 < 50
2. n2 > n3
3. n1 == n3

Otherwise, print "false".
*/

import java.util.Scanner;

public class CheckIfOneConditionIsTrue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);
        System.out.println(n1 < 50 || n2 > n3 || n1 == n3);
    }
}
