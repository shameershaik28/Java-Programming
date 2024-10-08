import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Ensure the input follows the problem constraints
        if (A < 1 || A > 1000000 || B < 1 || B > 1000000 || C < 1 || C > 1000000) {
            System.out.println("Input values must be between 1 and 1000000.");
            return;
        }

       if(A>B && A>C){
           System.out.println(A);
       }
       else if(B>A && B>C){
           System.out.println(B);
       }
       else {
           System.out.println(C);
       }
    }
}
