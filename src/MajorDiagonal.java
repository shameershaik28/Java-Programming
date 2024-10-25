import java.util.Arrays;
import java.util.Scanner;

public class MajorDiagonal {
    public int[] solve(int[][] A) {
        int n = A.length;

        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
                ans[i]=A[i][i];
            }
        return ans;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int N = sc.nextInt();


        int[][] A = new int[N][N];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        MajorDiagonal m = new MajorDiagonal();
        System.out.println(Arrays.toString(m.solve(A)));
    }
}
