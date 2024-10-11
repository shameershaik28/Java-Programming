import java.util.Scanner;

public class SquareRoot {
    public  int  solve(int A) {
        for(int i =1;i*i<=A;i++)
        {
            if(A==i*i)
            {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        SquareRoot sr = new SquareRoot();
        System.out.println(sr.solve(A));
    }
}
