import java.util.Scanner;

public class PalindromicInteger {
    public void PalindromicInteger(int num)
    {
        int first= num;
        int sum =0;

        while(num >0)
        {
            int lastDigit = num % 10;
            sum = sum * 10+lastDigit;
            num /= 10;
        }
        if(first==sum)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A<=0) return;
        PalindromicInteger p = new PalindromicInteger();
        p.PalindromicInteger(A);
    }
}
