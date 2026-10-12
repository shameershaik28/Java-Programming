package Functions;

import java.util.Scanner;

public class SquareOfANumber {

    public static int solve(int A) {
        return A * A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }
}
