package Functions;

import java.util.Scanner;

public class CountOfPrimes {

    public static int solve(int A) {
        int totalCount = 0;

        for (int i = 2; i <= A; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                totalCount++;
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }
}
