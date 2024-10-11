import java.util.Scanner;

public class PrintNStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        if(N<=1 || N>100)
        {
            return;
        }
        for(int i =0; i<N; i++)
        {
            System.out.print("*");
        }
    }
}
