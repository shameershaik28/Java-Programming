package Functions;

import java.util.Scanner;

public class FavouriteChocolate {

    public static int solve(int A, int B, int C) {
        return Math.min(A / B, C);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // Money Alex has
        int B = sc.nextInt(); // Cost of one chocolate
        int C = sc.nextInt(); // Maximum chocolates allowed

        System.out.println(solve(A, B, C));

        sc.close();
    }
}
