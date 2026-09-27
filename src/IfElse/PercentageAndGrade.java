package IfElse;

import java.util.Scanner;

/*
Problem: Percentage and Grade

Write a program to calculate the percentage and grade of a student.

Five numbers (A, B, C, D & E) represent the marks of a student
in 5 subjects, each out of 100.

Grade based on percentage:

- Percentage >= 90%       -> Grade A
- Percentage >= 80% < 90% -> Grade B
- Percentage >= 70% < 80% -> Grade C
- Percentage >= 60% < 70% -> Grade D
- Percentage >= 40% < 60% -> Grade E
- Percentage < 40%        -> Grade F

Note:
Take the lowest integer value of the percentage.
For example, 90.8% should be treated as 90%.
*/
public class PercentageAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();

        int percentage = (A + B + C + D + E) / 5;
        System.out.println(percentage);


        if(percentage >= 90)
        {
            System.out.println("A");
        }
        else if(percentage >= 80 && percentage < 90)
        {
            System.out.println("B");
        }
        else if(percentage >= 70 && percentage < 80)
        {
            System.out.println("C");
        }
        else if(percentage >= 60 && percentage < 70)
        {
            System.out.println("D");
        }
        else if(percentage >= 40 && percentage < 60)
        {
            System.out.println("E");
        }
        else{
            System.out.println("F");
        }
    }
}
