package DataTypes;

/*
Problem: Area Of Rectangle

Question:
Given the value of Length (L) and Breadth (B) of a Rectangle.
Calculate the Area Of Rectangle and print the result.

Note:
Formula for Area of Rectangle:
Area = Length * Breadth
*/

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(L*B);
    }
}
