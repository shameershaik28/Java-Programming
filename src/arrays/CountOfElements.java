package arrays;


import java.util.Scanner;

public class CountOfElements {

    public static int solve(int[] A) {
        int N = A.length;
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < N; i++) {
            max = Math.max(max, A[i]);
        }

        for (int i = 0; i < N; i++) {
            if (A[i] == max) {
                count++;
            }
        }

        return N - count;
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

