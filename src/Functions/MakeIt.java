package Functions;

import java.util.Scanner;

public class MakeIt {

    public static int solve(int A, int B) {
        int slices = 3;
        int result = A * slices + B;

        return result / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // Number of mangoes
        int B = sc.nextInt(); // Existing mango slices

        System.out.println(solve(A, B));

        sc.close();
    }
}
