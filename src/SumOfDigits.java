import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if(T == 0|| T>100)
        {
            return;
        }

        for(int i =0; i<T; i++)
        {
            int N = sc.nextInt();
            int sum =0;
            while(N>0)
            {
                int lastDigit= N%10;
                sum = sum+lastDigit;
                N= N/10;
            }
            System.out.println(sum);
        }



    }
}
