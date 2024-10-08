import java.util.Scanner;

public class CategoriesTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if (A > 0) {
            System.out.println("It is positive Value");
        } else if (A < 0) {
            System.out.println("It is negative Value");
        } else {
            System.out.println(0);
        }
    }
}