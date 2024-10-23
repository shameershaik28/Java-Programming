import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {
    public void solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        for(int i =0; i<n ; i++)
        {
            for(int j =i+1; j<n; j++)
            {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        System.out.println("This is the Transpose matrix :");
        System.out.println(Arrays.deepToString(A));

        for(int i =0; i<n; i++)
        {
            int s =0;
            int e=m-1;
            while(s<e)
            {
                int temp = A[i][s];
                A[i][s] = A[i][e];
                A[i][e] = temp;
                s++;
                e--;
            }
        }
        System.out.println("This is the rotated matrix :");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int N = sc.nextInt();


        int[][] matrix = new int[N][N];

        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        RotateMatrix obj = new RotateMatrix();
        obj.solve(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }
}
