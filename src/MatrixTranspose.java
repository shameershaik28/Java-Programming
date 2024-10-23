import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {
    // Method to transpose in place for square matrices
    public void transposeInPlace(int[][] A) {
        int N = A.length;  // Assuming square matrix, so N == M

        // Swap elements across the diagonal
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // Swap A[i][j] and A[j][i]
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int N = sc.nextInt();

        // This assumes it's a square matrix (N x N)
        int[][] A = new int[N][N];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        MatrixTranspose mt = new MatrixTranspose();
        mt.transposeInPlace(A);  // Transpose the matrix in place

        // Print the transposed matrix
        System.out.println(Arrays.deepToString(A));
    }
}
