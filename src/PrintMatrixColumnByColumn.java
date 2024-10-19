import java.util.Scanner;

public class PrintMatrixColumnByColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int M = sc.nextInt();

        //edge case
        if(N<1 || M<1 || N>100 || M>100){
            return;
        }
        int[][] matrix = new int[N][M];
        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing Matrix : ");
        for(int j=0;j<M;j++)
        {
            for(int i=0;i<N;i++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
