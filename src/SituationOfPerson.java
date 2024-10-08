import java.util.Scanner;

public class SituationOfPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp  = sc.nextDouble();

        if((temp>=85.0) && (temp<=91.0))
        {
            System.out.println("Serious Hypothermia");
        }
        else if((temp>91.0) && (temp<95.0))
        {
            System.out.println("Mild Hypothermia");
        }
        else if((temp>=95.0) && (temp<=98.0))
        {
            System.out.println("Normal Temperature");
        }
        else if((temp>98.0) && (temp<=100.0))
        {
            System.out.println("HMild Fever");
        }
        else if((temp>100.0) && (temp<=105.0))
        {
            System.out.println("High Fever");
        }
        else {
            System.out.println("Something went wrong");
        }
    }
}
