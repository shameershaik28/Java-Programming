package Functions;

import java.util.Scanner;

public class AreaOfCircle {

    public static double solve(int A) {
        double area = 3.1416 * A * A;
        return Math.round(area * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.printf("%.2f%n", solve(A));

        sc.close();
    }
}
