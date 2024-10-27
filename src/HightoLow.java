import java.util.Scanner;

public class HightoLow {
    public String solve(String S) {
        return S.toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

       HightoLow h = new HightoLow();
       System.out.println(h.solve(S));


    }

}
