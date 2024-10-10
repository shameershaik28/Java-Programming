import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N==0)
        {
            return;
        }
        int count = 0;
        for(int i=1; i<=N ; i++)
        {
            if (N % i == 0 ) {

                count= count+1;
            }
        }
        if(count==2)
        {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime number");
        }

    }
}
