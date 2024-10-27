import java.util.Scanner;

public class ReverseTheWord {
    public String solve(String A) {
        StringBuilder ans = new StringBuilder(A);

        ans.reverse();
        return ans.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ReverseTheWord r = new ReverseTheWord();
       System.out.println(r.solve(s));
    }
}
