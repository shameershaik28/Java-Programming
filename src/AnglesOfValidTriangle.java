import java.util.Scanner;

public class AnglesOfValidTriangle {
    public void triangle(int A, int B, int C)
    {
        int sum= A+B+C;
        if(A > 0 && B > 0 && C > 0 && sum==180)
        {
            System.out.println("The triangle is a valid triangle");
        }
        else
            System.out.println("The triangle is not a valid triangle");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        AnglesOfValidTriangle angles = new AnglesOfValidTriangle();
        angles.triangle(A, B, C);
    }
}
