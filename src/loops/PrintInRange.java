package loops;

import java.util.Scanner;

/*
Problem: Print in Range

Given two numbers, A and B, print all the numbers in the range
from A to B, both inclusive.

Each number should be followed by a space, including the last number.
*/
public class PrintInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        while(A<=B)
        {
            System.out.print(A+" ");
            A++;
        }
    }
}
