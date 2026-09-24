package IfElse;

/*
Problem: Relation of 18 with N

Question:
Given a number N, print the output according to the following conditions:

- If N is greater than 18, print "N is Greater than 18".
- If N is less than 18, print "N is smaller than 18".
- Otherwise, print "N is equal to 18".
*/

import java.util.Scanner;

public class RelationOf18WithN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N > 18) {
            System.out.println("N is Greater than 18");
        } else if (N < 18) {
            System.out.println("N is smaller than 18");
        } else {
            System.out.println("N is equal to 18");
        }
    }
}
