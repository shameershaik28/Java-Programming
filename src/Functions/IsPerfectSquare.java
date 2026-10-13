package Functions;

import java.util.Scanner;

public class IsPerfectSquare {

    public static int solve(int A) {
        for (int i = 1; i * i <= A; i++) {
            if (i * i == A) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }
}
