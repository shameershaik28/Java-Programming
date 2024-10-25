import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public int[][] solve(int[][] A, int[][] B) {
        int M = A.length; // Number of rows in A
        int N = A[0].length; // Number of columns in A (also number of rows in B)
        int P = B[0].length; // Number of columns in B

        // Resultant matrix C will have dimensions M x P
        int[][] C = new int[M][P];

        // Matrix multiplication logic
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < P; j++) {
                for (int k = 0; k < N; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for matrix A
        System.out.println("Enter number of rows (M) and columns (N) for Matrix A:");
        int M = sc.nextInt();
        int N = sc.nextInt();

        // Input validation to ensure M and N are within bounds
        if (M < 1 || M > 100 || N < 1 || N > 100) {
            System.out.println("Matrix dimensions out of bounds. M and N should be between 1 and 100.");
            return;
        }
        // Input matrix A
        int[][] A = new int[M][N];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input dimensions for matrix B
        System.out.println("Enter number of columns (P) for Matrix B:");
        int P = sc.nextInt();

        // Input validation to ensure P is within bounds
        if (P < 1 || P > 100) {
            System.out.println("Matrix dimensions out of bounds. P should be between 1 and 100.");
            return;
        }
        // Input matrix B (Dimensions N x P)
        int[][] B = new int[N][P];
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < P; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Perform matrix multiplication
        MatrixMultiplication mb = new MatrixMultiplication();
        int[][] result = mb.solve(A, B);

        // Output the result
        System.out.println("Resultant Matrix after multiplication:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }

        sc.close();
    }
}
