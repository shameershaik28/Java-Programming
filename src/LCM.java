import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A >= 1 && A <= 200 && B >= 1 && B <= 200) {
            int LCM = Math.max(A, B);


            while (true) {
                if (LCM % A == 0 && LCM % B == 0) {
                    System.out.println(LCM);
                    break;
                }
                LCM++;
            }
        }
    }
}
