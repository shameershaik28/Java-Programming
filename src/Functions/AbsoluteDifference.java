package Functions;

import java.util.Scanner;

public class AbsoluteDifference {

    public static int solve(int A, int B) {
        return Math.abs(A - B);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(solve(A, B));

        sc.close();
    }
}
