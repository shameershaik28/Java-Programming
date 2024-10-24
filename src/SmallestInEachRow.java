import java.util.Arrays;
import java.util.Scanner;

public class SmallestInEachRow {
    public int[] solve(int[][] A) {

        int N = A.length;
        int M = A[0].length;

        int[] ans = new int[N];

        for(int i = 0; i < N; i++)
        {
            int min =Integer.MAX_VALUE;
            for(int j = 0; j < M; j++)
            {
                if(A[i][j] <min)
                {
                    min = A[i][j];
                }
            }
            ans[i]= min;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns");
        int M = sc.nextInt();

        int[][] A = new int[N][M];

        System.out.println("Enter the elements");
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        SmallestInEachRow obj = new SmallestInEachRow();
        System.out.println(Arrays.toString(obj.solve(A)));
    }
}