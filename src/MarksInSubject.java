import java.util.Scanner;

public class MarksInSubject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String SubjectName = sc.nextLine();
        int  MarksAchieve = sc.nextInt();

        if (MarksAchieve >= 0 && MarksAchieve <= 1000) {
            System.out.println("Marks in " + SubjectName + " is " + MarksAchieve);
        }
    }
}
