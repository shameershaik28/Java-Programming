import java.util.Scanner;

public class WavePrintRowWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];

        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++)
        {
            if(i%2==0)
            {
                for(int j = 0; j < N; j++)
                {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            else {
                for(int j=N-1; j>=0;j--)
                {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

    }
}
