import java.util.Arrays;
import java.util.Scanner;

public class LargestInEachRow {
    public int[] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                if(A[i][j] >max)
                {
                    max = A[i][j];
                }
            }
            ans[i] = max;
        }
        System.out.println("The max element in every row is :");
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int N = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int M = sc.nextInt();

        int[][] mat = new int[N][M];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        LargestInEachRow l = new LargestInEachRow();
        System.out.println(Arrays.toString(l.solve(mat)));

    }
}
