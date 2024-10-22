import java.util.Arrays;
import java.util.Scanner;

public class SumOfEveryColumn {
    public int[] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int[] ans = new int[m];

        for(int j=0;j<m;j++){
            int sum =0;
            for(int i=0;i<n;i++){
                sum+=A[i][j];
            }
            ans[j] = sum;
        }
        System.out.println("The sum of  elements in every column are :");
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

        SumOfEveryColumn l = new SumOfEveryColumn();
        System.out.println(Arrays.toString(l.solve(mat)));

    }
}