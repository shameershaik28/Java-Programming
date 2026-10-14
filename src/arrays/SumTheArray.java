package arrays;

import java.util.Scanner;

public class SumTheArray {

    public static int solve(int[] A) {
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(A));

        sc.close();
    }
}
