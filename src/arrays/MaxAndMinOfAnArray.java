package arrays;

import java.util.Scanner;

public class MaxAndMinOfAnArray {

    public static void solve(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            min = Math.min(A[i], min);
            max = Math.max(A[i], max);
        }

        System.out.println(max + " " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        solve(A);

        sc.close();
    }
}
