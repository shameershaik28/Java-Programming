import java.util.Scanner;

public class ReplacingCharacter {
    public static String change_char(String s) {
        StringBuilder sb = new StringBuilder(s);

        int ele = sb.charAt(0);

       for(int i = 1; i < sb.length(); i++) {
           if(sb.charAt(i) == ele) {
               sb.setCharAt(i, '$');
           }
       }
       return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(change_char(s));
    }
}
