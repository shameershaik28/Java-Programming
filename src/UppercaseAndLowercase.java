import java.util.Scanner;

public class UppercaseAndLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int upperCaseCounter=0;
        int lowerCaseCounter=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
               upperCaseCounter++;
            }
            else
            {
                lowerCaseCounter++;
            }
        }
        System.out.println("The UpperCase count is "+ upperCaseCounter);
        System.out.println("The lowerCase count is "+ lowerCaseCounter);
    }
}
