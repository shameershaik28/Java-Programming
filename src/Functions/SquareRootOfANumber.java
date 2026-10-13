package Functions;

import java.util.Scanner;

public class SquareRootOfANumber {

    public static int solve(int A) {
        for (int i = 1; i * i <= A; i++) {
            if (i * i == A) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }
}
