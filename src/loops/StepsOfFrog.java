package loops;
/*
Problem: Steps Of Frog

A frog is currently at position X.
Its jump size, i.e. the distance covered in a single jump, is Y.

Print the next 5 positions when the frog takes 5 continuous jumps.
*/

import java.util.Scanner;

public class StepsOfFrog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        for(int i=1; i<=5; i++)
        {
            X = X + Y;
            System.out.print(X+" ");
        }
    }
}
