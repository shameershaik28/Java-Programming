package Operators;
/*
Problem: Modify-X

Question:
You are given a variable X. Modify it using the following steps:

1. Make X five times greater than the original value.
2. Increment the value of X by 10.
3. Divide the value of X by 2.

Note:
- Modify X step by step without using any extra variable.
- The value of X must be modified at the end of all steps.
- Do not use any extra variable other than X.
*/

import java.util.Scanner;

public class ModifyX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X= sc.nextInt();

        X = X * 5;
        X += 10;
        X /= 2;
        System.out.println(X);
    }
}
