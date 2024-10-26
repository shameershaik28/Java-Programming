import java.util.Scanner;

public class contest {
    public int solve(int[][] A)
    {
        int N = A.length;
        int M = A[0].length;
        int sum = 0;

        for(int i = 0; i < N; i++)
        {
            int Max = Integer.MIN_VALUE;
            int Min = Integer.MAX_VALUE;
        for(int j = 0; j < M; j++)
        {
            if(A[i][j]>Max)
            {
                Max = A[i][j];
            }
           if(A[i][j]<Min)
            {
                Min = A[i][j];
            }
        }
        sum = sum + (Max-Min);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int M = sc.nextInt();


        int[][] A = new int[N][M];
System.out.println("Enter the elements of A: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        contest obj = new contest();
       System.out.println(obj.solve(A));
    }
}
