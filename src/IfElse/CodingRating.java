package IfElse;
/*
Problem: Coding Rating

Write a program to input an integer n representing the rating
of a person on a platform.

Print the category of the person based on the rating:

- Rating >= 2100 -> "grand master"
- Rating >= 1900 -> "candidate master"
- Rating >= 1600 -> "expert"
- Rating >= 1400 -> "pupil"
- Rating < 1400  -> "newbie"

Note:
If the rating is odd, print the category in lowercase.
If the rating is even, print the category in UPPERCASE.
*/

import java.util.Scanner;

public class CodingRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rating = sc.nextInt();

        if (rating % 2 != 0) {
            if (rating >= 2100) {
                System.out.println("grand master");
            } else if (rating >= 1900) {
                System.out.println("candidate master");
            } else if (rating >= 1600) {
                System.out.println("expert");
            } else if (rating >= 1400) {
                System.out.println("pupil");
            } else {
                System.out.println("newbie");
            }
        } else {

            if (rating >= 2100) {
                System.out.println("grand master".toUpperCase());
            } else if (rating >= 1900) {
                System.out.println("candidate master".toUpperCase());
            } else if (rating >= 1600) {
                System.out.println("expert".toUpperCase());
            } else if (rating >= 1400) {
                System.out.println("pupil".toUpperCase());
            } else {
                System.out.println("newbie".toUpperCase());
            }
        }
    }
}
