package DataTypes;

/*
Problem: Preparation Time

Question:
Each layer of lasagna takes 2 minutes to prepare.
Given the number of layers you want to add to the lasagna,
find how many minutes you would spend making them.
*/

import java.util.Scanner;

public class PreparationTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int layers = sc.nextInt();

        int time = layers * 2;
        System.out.println(time);
    }
}
