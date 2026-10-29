package arrays;


import java.util.Scanner;

public class SumOfJthColumn {

    public int solve(int[][] A, int B) {
        int N = A.length;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i][B];
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

        SumOfJthColumn obj = new SumOfJthColumn();
        System.out.println(obj.solve(A, B));

        sc.close();
    }
}

