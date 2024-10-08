import java.util.Scanner;

public class CategoriseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N != 0) {
            if (N % 2 == 0) {
                if (N < 0) {
                    System.out.println("Negative-Even");
                } else {
                    System.out.println("Positive-Even");
                }
            } else {
                if (N < 0) {
                    System.out.println("Negative-Odd");
                } else {
                    System.out.println("Positive-Odd");
                }
            }
        }
    }
}
