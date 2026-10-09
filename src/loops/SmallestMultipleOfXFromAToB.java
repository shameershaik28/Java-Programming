package loops;

import java.util.Scanner;

/*
Problem: Smallest Multiple of X from A to B

Given three numbers X, A, and B, print the smallest multiple
of X in the range from A to B.

Multiple:
If n % m == 0, then n is a multiple of m.
*/
public class SmallestMultipleOfXFromAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int smallest = 0;

        for(int i=A; i<=B; i++)
        {
            if(i % X ==0)
            {
                smallest = i;
                break;
            }
        }
        System.out.print(smallest);

    }
}
