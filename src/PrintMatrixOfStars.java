import java.util.Scanner;

public class PrintMatrixOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if(N < 1 || M < 1 || N > 100 || M > 100)
        {
            return;
        }

        for(int i =0; i<N; i++)
        {
            for(int j =0; j<M; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
