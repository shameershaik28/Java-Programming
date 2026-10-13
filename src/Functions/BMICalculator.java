package Functions;

import java.util.Scanner;

public class BMICalculator {

    public static String solve(int A, int B) {
        double heightM = A / 100.0;
        double bmi = B / (heightM * heightM);

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int heightCm = sc.nextInt();
        int weightKg = sc.nextInt();

        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);

        System.out.println(solve(heightCm, weightKg));
        System.out.printf("%.1f%n", bmi);

        sc.close();
    }
}
