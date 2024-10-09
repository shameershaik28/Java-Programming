import java.util.Scanner;

public class PrintFromRightToLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N<0)
        {
            N = N*-1; // Convert -ve value to positive
        }

        while(N>0)
        {
            int lastDigit= N%10; // take the last digit of the value and store it in the variable
            System.out.println(lastDigit);
            N=N/10; // remove the last remove
        }
    }
}
