import java.util.Scanner;

public class Sum {
    public void sum(int a, int b, int c) {
       int result = a + b + c;
       System.out.println(result);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       Sum s = new Sum(); // object of class
       s.sum(a, b, c); //passing the arguments to the sum function

    }
}
