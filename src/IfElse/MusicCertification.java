package IfElse;

/*
Problem: Music Certification

A music company gives an album a certification based on the
total number of albums sold.

Certification levels:

- N >= 10,000,000 -> "diamond"
- N >= 1,000,000  -> "platinum"
- N >= 500,000    -> "gold"
- N < 500,000     -> "None"

Determine the highest certification earned by the album.

Important:
Check the certification levels from the highest threshold
to the lowest threshold.
*/

import java.util.Scanner;

public class MusicCertification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N >= 10000000)
        {
            System.out.println("diamond");
        }
        else if (  N >= 1000000)
        {
            System.out.println("platinum");

        }
        else if(  N >= 500000)
        {
            System.out.println("gold");
        }
        else
        {
            System.out.println("None");
        }
    }
}
