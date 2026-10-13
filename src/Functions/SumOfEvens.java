package Functions;

import java.util.Scanner;

public class SumOfEvens {

    public static int solve(int A) {
        int sum = 0;

        for (int i = 1; i <= A; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }
}
