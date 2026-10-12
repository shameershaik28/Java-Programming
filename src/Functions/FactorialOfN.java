package Functions;

import java.util.Scanner;

public class FactorialOfN {

    public static int solve(int A) {
        int count = 1;

        for (int i = 1; i <= A; i++) {
            count = count * i;
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
