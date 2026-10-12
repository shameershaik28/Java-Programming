package Functions;

import java.util.Scanner;

public class CubeIt {

    public static int cube(final int A) {
        return A * A * A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(cube(A));

        sc.close();
    }
}
