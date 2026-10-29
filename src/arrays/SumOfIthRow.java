package arrays;


import java.util.Scanner;

public class SumOfIthRow {

    public int solve(int[][] A, int B) {
        int M = A[0].length;
        int sum = 0;

        for (int j = 0; j < M; j++) {
            sum += A[B][j];
        }

        return sum;
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

        int B = sc.nextInt();

        SumOfIthRow obj = new SumOfIthRow();
        System.out.println(obj.solve(A, B));

        sc.close();
    }
}

