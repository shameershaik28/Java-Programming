package IfElse;
/*
Problem: Pac-Man

You have to determine whether Pac-Man loses or not.

Inputs:
1. Whether Pac-Man has a power pellet active:
   1 = Yes, 0 = No
2. Whether Pac-Man is touching a ghost:
   1 = Yes, 0 = No

Pac-Man loses if:
- He is touching a ghost AND
- He does not have a power pellet active.

Input Format:
There are 2 lines in the input.

The first line indicates if Pac-Man has a power pellet active.
The second line indicates if Pac-Man is touching a ghost.
*/

import java.util.Scanner;

public class PacMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int powerPellet = sc.nextInt();
        int ghost = sc.nextInt();


        if (ghost == 1 && powerPellet == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
