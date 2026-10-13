package Functions;

import java.util.Scanner;

public class PowerFunction {

    public static int power(final int A, final int B) {
        int sum = 1;

        for (int i = 1; i <= B; i++) {
            sum *= A;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(power(A, B));

        sc.close();
    }
}
