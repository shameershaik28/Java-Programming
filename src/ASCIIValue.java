import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++){
            int Ascii = s.charAt(i);
            System.out.print(Ascii+" ");
        }
    }
}
