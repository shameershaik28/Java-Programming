import java.util.Scanner;

public class PrintSumOfEveryRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];

        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++){
            int sum =0;
            for(int j = 0; j < M; j++){
                sum =sum+matrix[i][j];
            }
            System.out.print(sum+" ");
        }
    }
}
