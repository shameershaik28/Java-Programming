import java.util.Scanner;

public class SumOfEvens {
    public int Even(int A) {
        int sum = 0;
        for(int i=1; i<=A; i++)
        {
            if(i%2==0)
            {
                sum =sum+i;
            }
        }
           return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        SumOfEvens sum = new SumOfEvens();
        System.out.println(sum.Even(A));
    }
}
