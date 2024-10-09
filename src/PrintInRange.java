import java.util.Scanner;

public class PrintInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        //Edge case to handle the range
        if (A >= 0 && A <= 500 && B >= 0 && B <= 500) {

            while (A <= B) {
                System.out.print(A + " ");
                A++;
            }
        }
    }
}