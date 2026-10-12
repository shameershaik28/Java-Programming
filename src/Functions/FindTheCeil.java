package Functions;

import java.util.Scanner;

public class FindTheCeil {

    public static int solve(int A) {
        return (int) Math.ceil(A / 200.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(solve(A));

        sc.close();
    }
}
