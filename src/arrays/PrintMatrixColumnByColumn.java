package arrays;


import java.util.Scanner;

public class PrintMatrixColumnByColumn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] A = new int[rows][col];

        // Read the matrix row by row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Print the matrix column by column
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

