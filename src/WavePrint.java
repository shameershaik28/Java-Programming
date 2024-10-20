import java.util.Scanner;

public class WavePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  integer N: ");
        int N = sc.nextInt();

        int[][] mat  = new int[N][N];

 System.out.println("Enter the elements in the matrix: ");
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        int row = mat.length;
        int col = mat[0].length;


        for(int j=0; j<col; j++)
        {
            if(j%2==0)
            {
                for(int i =0; i<row;i++)
                {
                    System.out.print(mat[i][j] + " ");
                }
            }
            else
            {
                for(int i=row-1;i>=0;i--)
                {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}
