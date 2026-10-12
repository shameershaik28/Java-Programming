package Functions;

import java.util.Scanner;

public class CountOfDigits {

    public static int solve(int A) {
        A = Math.abs(A);

        if (A == 0) {
            return 1;
        }

        int count = 0;

        while (A > 0) {
            count++;
            A = A / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }
}
