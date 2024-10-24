import java.util.Arrays;
import java.util.Scanner;

public class SumOfColumns {
    public int[] solve(int A, int B, int[][] C) {


        int[] ans = new int[B];

        for (int j = 0; j < B; j++) {
            int sum = 0;
            for (int i = 0; i < A; i++) {
                sum += C[i][j];
            }
            ans[j] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int A = sc.nextInt();
        System.out.println("Enter the number of columns");
        int B = sc.nextInt();

        int[][] C = new int[A][B];

        System.out.println("Enter the elements of A");
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                C[i][j] = sc.nextInt();
            }
        }

        SumOfColumns rs = new SumOfColumns();
        System.out.println(Arrays.toString(rs.solve(A, B, C)));
    }
}
