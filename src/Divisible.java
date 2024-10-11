import java.util.Scanner;

public class Divisible {
        public void Div(int A, int B)
        {
            int sum = A/B;
            System.out.println(sum);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();

            Divisible m = new Divisible();
            m.Div(A, B);
        }
    }
