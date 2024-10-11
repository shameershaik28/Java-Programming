import java.util.Scanner;

public class HollowInvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //This is iterate for N times
        for(int i=1; i<=N; i++)
        {
            //it will print  until i
            for(int j =1; j<=i; j++)
            {
                System.out.print("*");
            }

            //it calculate and print spaces
            for(int s=1; s<=(2*(N-i)); s++)
            {
                System.out.print(" ");
            }

            //it will print  until i
            for(int j =1; j<=i; j++)
            {
                System.out.print("*");
            }
           System.out.println();
        }

    }
}
