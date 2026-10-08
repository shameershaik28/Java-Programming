package loops;

import java.util.Scanner;

/*
Problem: Print A to B except X and Y

Given A, B, X, and Y, print all the numbers from A to B
except X and Y.
*/
public class PrintAToBExceptXAndY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        for(int i=A; i<=B;  i++)
        {
            if(i==X || i==Y)
            {
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
