import java.util.Scanner;

public class MaxOfjthColumn {
    public int solve(int[][] A, int B) {
        if (A == null || A.length == 0 || A[0].length == 0 || B < 0) return 0;
        int N = A.length;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i][B] > max) {
                max = A[i][B];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns");
        int M = sc.nextInt();
        System.out.println("Enter the column index");
        int B = sc.nextInt();

        int[][] A = new int[N][M];

        System.out.println("Enter the elements of Matrix A");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        MaxOfjthColumn obj = new MaxOfjthColumn();
        System.out.println(obj.solve(A, B));
    }
}
