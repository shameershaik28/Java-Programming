import java.util.Scanner;

public class MinElementInMatrix {
    public int solve(int[][] A) {
        if(A == null || A.length == 0 || A[0].length == 0)
        {
            return 0;
        }
        int N = A.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if (A[i][j] < min) {
                    min = A[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int N = sc.nextInt();
        System.out.println("Enter the column : ");
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];

        System.out.println("Enter the matrix : ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        MinElementInMatrix min = new MinElementInMatrix();
        System.out.println(min.solve(matrix));
    }
}
