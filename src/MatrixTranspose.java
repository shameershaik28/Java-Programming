import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {
    public int[][] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        int[][] ans = new int[M][N];

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
            {
                ans[j][i] = A[i][j];
            }
        }

        return ans;
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

        MatrixTranspose mt = new MatrixTranspose();
        System.out.println(Arrays.deepToString(mt.solve(A)));
    }
}
