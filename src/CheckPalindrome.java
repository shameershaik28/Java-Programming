import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if(T==0||T>100)
        {
            return;
        }

        for(int i =0; i<T ; i++)
        {
            int N = sc.nextInt();
            int firstValue = N;
            int reverseNumber= 0;
            while(N>0)
            {
                int lastDigit= N%10;
                reverseNumber = reverseNumber*10+lastDigit;
                N = N/10;
            }

             if(firstValue == reverseNumber)
             {
                System.out.println("It is a palindrome.");
             }
             else
             {
                System.out.println("It is not a palindrome.");
             }
        }

    }
}
