import java.util.Scanner;

public class IdentityMatrix {
    public int solve(final int[][] A) {
        int N = A.length;
        int M = A[0].length;

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                if(A[i][i] ==0)
                {
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] A = new int[N][M];

        System.out.println("Enter the elements of A: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        IdentityMatrix I = new IdentityMatrix();
        System.out.println(I.solve(A));
    }
}
