import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<1 || N>100)
        {
            return;
        }

       for(int i=0; i<N; i++)
       {

           for(int j =0; j<N-i; j++)
           {

               System.out.print("*");
           }
           System.out.println();
       }
    }
}