package Functions;

import java.util.Scanner;

public class PrintEvenOdd {

    public static void solve(int A) {
        if (A % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        solve(A);

        sc.close();
    }
}
