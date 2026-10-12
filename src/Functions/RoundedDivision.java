package Functions;

import java.util.Scanner;

public class RoundedDivision {

    public static int solve(int A) {
        double value = A / 200.0;

        if (value >= 0) {
            return (int) Math.floor(value + 0.5);
        } else {
            return (int) Math.ceil(value - 0.5);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }
}
