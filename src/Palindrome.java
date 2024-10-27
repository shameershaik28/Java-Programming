import java.util.Scanner;

public class Palindrome {
    public static boolean isPalin(String s) {
      int N = s.length();

      for (int i = 0; i < N; i++) {
          if (s.charAt(i) != s.charAt(N - 1 - i)) {
              return false;
          }
      }
      return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalin(s));
    }
}
