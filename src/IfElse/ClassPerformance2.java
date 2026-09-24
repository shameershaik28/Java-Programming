package IfElse;

/*
Problem: Class Performance 2

Question:
You are given marks of 2 subjects scored by students of Class A
and Class B.

Compare the average performance of Class A and Class B.

Print "True" if Class A performed strictly better than Class B.
Otherwise, print "False".

Input Format:
There are 4 lines in the input.

The first and second lines contain the marks of the two subjects
for Class A.

The third and fourth lines contain the marks of the two subjects
for Class B.
*/

import java.util.Scanner;

public class ClassPerformance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1A = sc.nextInt();
        int sub2A = sc.nextInt();
        int sub1B = sc.nextInt();
        int sub2B = sc.nextInt();


        double classA = (sub1A + sub2A) / 2.0 ;
        double classB = (sub1B + sub2B) / 2.0 ;

        if(classA > classB)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
