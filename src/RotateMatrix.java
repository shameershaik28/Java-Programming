import java.util.Scanner;

public class RotateMatrix {
    public void solve(int[][] A) {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        RotateMatrix obj = new RotateMatrix();
        obj.solve(matrix);
    }
}
