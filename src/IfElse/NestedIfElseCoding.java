package IfElse;

import java.util.Scanner;

public class NestedIfElseCoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N >=10 && N <=20)
        {
            int M = sc.nextInt();
            int sum =  N + M;
            System.out.println(sum);
            if(sum >= 100)
            {
                System.out.println("That is a large sum!");
            }
        }
        else
        {
            System.out.println(-1);
        }
    }
}
