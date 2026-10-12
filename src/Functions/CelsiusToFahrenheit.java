package Functions;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static double solve(double celsius) {
        double F = (9.0 / 5) * celsius + 32;
        double result = Math.round(F * 100) / 100d;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius = sc.nextDouble();

        System.out.println(solve(celsius));

        sc.close();
    }
}
