package loops;

import java.util.Scanner;

public class IsItPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for(int i=1; i<=N; i++)
        {
            if(N % i == 0)
            {
                count++;
            }
        }

        if(count == 2)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }

    }
}
