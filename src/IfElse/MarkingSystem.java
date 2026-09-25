package IfElse;
/*
Problem: Marking System

Given the marks of a student M:

- If marks >= 50, the student has passed.
  Print "PASS" and the student's grade.

Grading system:
- Marks between [50, 80] -> B
- Marks between [81, 100] -> A

- If marks are below 50, print "FAIL".
*/

import java.util.Scanner;

public class MarkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        if(M >= 50)
        {
            if(M >= 50 && M <= 80)
            {
                System.out.println("PASS B");
            }

            if(M >= 81 && M <= 100)
            {
                System.out.println("PASS A");
            }
        }
        else
        {
            System.out.println("FAIL");

        }
    }
}
