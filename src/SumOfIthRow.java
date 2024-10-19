import java.util.Scanner;

public class SumOfIthRow {
    public int solve(int[][] A, int B) {

        int M = A[0].length;
        int sum =0;
        for(int col = 0; col < M; col++) {
            sum = sum + A[B][col];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int M = sc.nextInt();
        System.out.println("Enter the Row Index B : ");
        int B = sc.nextInt();

         int[][] matrix = new int[N][M];

         System.out.println("Enter the Matrix elements : ");
         for(int i = 0; i < N; i++){
             for(int j = 0; j < M; j++){
                 matrix[i][j] = sc.nextInt();
             }
         }

        SumOfIthRow obj = new SumOfIthRow();
         System.out.print(obj.solve(matrix, B));
    }
}
