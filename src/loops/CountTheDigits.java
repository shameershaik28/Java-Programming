package loops;

import java.util.Scanner;
/*
Problem: Count the Digits

Take T (number of test cases) as input.

For each test case:
- Take an integer N as input.
- Print the count of digits of that number.

Note:
The number of digits for 0 is considered as 1.
*/
public class CountTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++)
        {
            int N = sc.nextInt();
            int count = (N == 0) ? 1 : 0;

            while(N > 0)
            {
                N = N/10;
                count++;
            }

            System.out.println(count);
        }
    }
}
