import java.util.Scanner;

public class MaxElementInMatrix {
    public int solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        int Max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(A[i][j]>Max)
                {
                    Max = A[i][j];
                }
            }
        }
        return Max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int M = sc.nextInt();

        int[][] A = new int[N][M];
      System.out.println("Enter the elements");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        MaxElementInMatrix obj = new MaxElementInMatrix();
        System.out.println("Max element of matrix is : "+ obj.solve(A));
    }
}
