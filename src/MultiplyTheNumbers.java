import java.util.Scanner;

public class MultiplyTheNumbers {
        public void Multiply(int A, int B)
        {
            int sum = A * B;
            System.out.println(sum);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();

            MultiplyTheNumbers m = new MultiplyTheNumbers();
            m.Multiply(A, B);
        }
    }
