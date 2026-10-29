package arrays;


import java.util.Scanner;

public class MaxElementInMatrix {

    public int solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                max = Math.max(max, A[i][j]);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        MaxElementInMatrix obj = new MaxElementInMatrix();
        System.out.println(obj.solve(A));

        sc.close();
    }
}

