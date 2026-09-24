package IfElse;
/*
Problem: Employee Bonus

A company decided to give a bonus of 5% to an employee if
their years of service are more than 5 years.

Ask the user for their name and years of service.

Print whether the employee should receive a bonus or not.
*/

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int service = sc.nextInt();

        if(service > 5)
        {
            System.out.println("Yes "+ name+" will recieve bonus.");
        }
        else
        {
            System.out.println("No "+ name+" will not recieve bonus.");
        }
    }
}
