import java.util.Scanner;

public class SumOfJthColumn {
    public int solve(int[][] A, int B) {
        int N = A.length;
        int sum =0;

        for(int i =0; i<N ; i++)
        {
            sum = sum + A[i][B];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns");
        int M = sc.nextInt();
        System.out.println("Enter the Column Index B");
        int B = sc.nextInt();

        int[][] matrix = new int[N][M];

        System.out.println("Enter the Matrix elements : ");
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        SumOfJthColumn obj = new SumOfJthColumn();
        System.out.println(obj.solve(matrix, B));
    }
}
