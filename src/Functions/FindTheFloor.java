package Functions;

import java.util.Scanner;

public class FindTheFloor {

    public static int solve(int A) {
        int result = (int) Math.floor(A / 200.0);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }
}
