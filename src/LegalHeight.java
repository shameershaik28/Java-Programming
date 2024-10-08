import java.util.Scanner;

public class LegalHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        if (height > 0 && height <= 100000) {

            if (height <= 5) {
                System.out.println("Maximum height possible for building is 30 meters");
            } else if (height <= 10) {
                System.out.println("Maximum height possible for building is 25 meters");
            } else if (height <= 15) {
                System.out.println("Maximum height possible for building is 20 meters");
            } else if (height <= 20) {
                System.out.println("M7aximum height possible for building is 10 meters");
            } else {
                System.out.println("Here construction is Prohibited");
            }
        }
    }
}
