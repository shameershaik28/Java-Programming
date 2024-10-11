import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N>10)
        {
            return;
        }
        int sum=1;
        for(int i=N;i>=1; i--)
        {
            sum =sum*i; // 1 = 1*5, keep on updating the current sum with the index i and store it back to sum
        }
        System.out.println(sum);
    }
}
