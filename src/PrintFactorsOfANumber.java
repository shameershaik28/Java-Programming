import java.util.Scanner;

public class PrintFactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if(N==0 || N>300)
        {
            return;
        }

        for(int i =1; i<=N ; i++)
        {
                if(N%i==0)
                {
                    System.out.print(i+" ");
                }
        }
    }
}
