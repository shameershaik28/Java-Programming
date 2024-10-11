import java.util.Scanner;

public class SquareOfNumber {
        public void Square(int A)
        {
            if(A==0)
            {
                return;
            }
            int sum = A * A;
            System.out.println(sum);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();

            SquareOfNumber m = new SquareOfNumber();
            m.Square(A);
        }
    }
