package Functions;

import java.util.Scanner;

public class VolumeOfCuboid {

    public static int solve(int A, int B, int C) {
        return A * B * C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // Length
        int B = sc.nextInt(); // Base
        int C = sc.nextInt(); // Height

        System.out.println(solve(A, B, C));

        sc.close();
    }
}
