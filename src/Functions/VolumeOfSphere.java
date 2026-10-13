package Functions;

import java.util.Scanner;

public class VolumeOfSphere {

    public static int solve(final int A) {
        double PI = Math.acos(-1);
        double sphere = (4.0 * PI * A * A * A) / 3.0;

        return (int) Math.ceil(sphere);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }
}
