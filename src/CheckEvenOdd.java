import java.util.Scanner;

public class CheckEvenOdd {
    public void solve(int N)
    {
        if(N%2==0)
        {
            System.out.println(0); // for even
        }
        else
            System.out.println(1); // for odd
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        CheckEvenOdd check = new CheckEvenOdd();
        check.solve(N);
    }
}
