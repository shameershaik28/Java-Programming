package loops;
/*
Problem: Ten Multiples

Take T (number of test cases) as input.

For each test case:
- Take an integer N as input.
- Print the first 10 continuous multiples of N.
*/
import java.util.Scanner;

public class TenMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++)
        {
            int N = sc.nextInt();

            for(int j=1; j<=10 ; j++)
            {
                System.out.print(N*j + " ");
            }
            System.out.println();

        }
    }
}
