import java.util.Scanner;

public class WhichTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A<1 || A>100000 || B<1 || B>100000 || C<1 || C>100000)
        {
            System.out.println("-1");
            return;
        }


        if(A==B && A==C)
        {
            System.out.println("equilateral");
        }
        else if(A!=B && A!=C && B!=C)
        {
            System.out.println("scalene");
        }
        else {
            System.out.println("isosceles");
        }
    }
}
