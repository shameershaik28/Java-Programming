import java.util.Scanner;

public class LastDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N<0 || N>10000000)
        {
            return;
        }

        //Finding the Last Digit Without a Loop (Standard Way)
        int sum = N %10;
        System.out.println(sum);

    }
}
