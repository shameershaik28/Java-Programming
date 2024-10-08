import java.util.Scanner;

public class AgeOfAPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >=0 && age<=150 )
        {
        if(age <= 12) {
            System.out.println("child");
        }
        else if(age <= 19) {
            System.out.println("Teenager");
        }
        else if(age <= 40) {
            System.out.println("Young");
        }
        else if(age <= 60) {
            System.out.println("Middle-Aged");
        }
        else {
            System.out.println("Senior-Citizen");
        }
    }
}
}
