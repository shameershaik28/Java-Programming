import java.util.Scanner;

public class FindReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean T = false;
        if(N <0)
        {
            T =true;
            N = -N;
        }
        int sum=0;
           while(N>0)
           {
            int lastDigit = N%10;
            sum = sum *10+lastDigit;
            N = N/10;
        }
            if(T)
            {
                sum =-sum;
            }

        System.out.println(sum);
    }
}
