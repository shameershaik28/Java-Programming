package IfElse;

/*
Problem: Scored Century

Question:
Given the runs scored by a batsman, find if he has scored a century or not.

If he has scored a century, print "Century!!!".
Otherwise, print "Better luck next time!".
*/

import java.util.Scanner;

public class ScoredCentury {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 100)
        {
            System.out.println("Century!!!");
        }
        else
        {
            System.out.println("Better luck next time!");
        }
    }
}
