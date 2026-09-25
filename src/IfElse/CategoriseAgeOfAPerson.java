package IfElse;
/*
Problem: Categorise Age Of A Person

Given the age of a person, categorise them based on their age.

Categories:
- Age 0 to 12       -> "Child"
- Age 13 to 19      -> "Teenager"
- Age 20 to 40      -> "Young"
- Age 41 to 60      -> "Middle-Aged"
- Age more than 60  -> "Senior-Citizen"

Note:
Use if-else-if conditions to solve this problem.
*/

import java.util.Scanner;

public class CategoriseAgeOfAPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >=0 && age <= 12)
        {
            System.out.println("Child");
        }
        else if( age >= 13 && age <= 19)
        {
            System.out.println("Teenager");
        }
        else if( age >= 20 && age <= 40)
        {
            System.out.println("Young");
        }
        else if( age >= 41 && age <= 60)
        {
            System.out.println("Middle-Aged");
        }
        else{
            System.out.println("Senior-Citizen");
        }
    }
}
