package IfElse;
/*
Problem: Calculate Attendance

Question:
A student is not allowed to take the exams if their attendance is less than 75%.

Given:
- Total number of classes held (T)
- Number of classes attended by Rahul (N)

Print "YES" if Rahul can take the exams.
Otherwise, print "NO".
*/

import java.util.Scanner;

public class CalculateAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();

        double  attendance = (N*100.0/ T);
        if(attendance < 75.0)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}
