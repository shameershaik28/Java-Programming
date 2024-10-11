import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<1 || N>100)
        {
            return;
        }
        int M=N;
       for(int i=1; i<=N; i++)
       {

           for(int j =M; j>=1; j--)
           {

               System.out.print("*");
           }
           M--;
           System.out.println();
       }
    }
}
