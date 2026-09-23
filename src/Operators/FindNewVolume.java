package Operators;
/*
Problem: Find New Volume

Question:
Given an integer A, find the volume of a cube with side (A + 1).

Note:
Try to use shorthand increments for learning purposes.
*/

import java.util.Scanner;

public class FindNewVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        A +=1;
        A =A * A * A;

        System.out.println(A);
    }
}
