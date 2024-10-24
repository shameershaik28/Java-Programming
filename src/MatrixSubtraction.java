import java.util.Arrays;
import java.util.Scanner;

public class MatrixSubtraction {
    public int[][] solve(int[][] A, int[][] B) {
        int N = A.length;
        int M = A[0].length;

        int[][] ans = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                ans[i][j]= A[i][j]-B[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        System.out.println("Enter the elements of A: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
       System.out.println("Enter the elements of B: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        MatrixSubtraction ms = new MatrixSubtraction();
        System.out.println(Arrays.deepToString(ms.solve(A, B)));

    }
}
