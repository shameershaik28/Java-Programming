import java.util.Scanner;

public class MultiplesOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // Edge case: N should be between 1 and 10000
        if(N==0 || N >10000)
        {
            return;
        }

        for(int i =1; i<=N ; i++)
        {
            if(i%4==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
