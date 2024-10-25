import java.util.Scanner;

public class MainDiagonalSum {
    public int solve(final int[][] A) {
       int N = A.length;
       int sum = 0;
       for(int i = 0; i < N; i++) {
           sum += A[i][i];
       }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns");
        int M = sc.nextInt();


        int[][] A = new int[N][M];

        System.out.println("Enter the elements of A");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        MainDiagonalSum m = new MainDiagonalSum();
        System.out.println(m.solve(A));
    }
}
