import java.util.Scanner;

public class Cube {
        public void CubeIt(int A)
        {
            if(A<=0 || A>1000)
            {
                return;
            }
            int sum = A*A*A;
            System.out.println(sum);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();

            Cube m = new Cube();
            m.CubeIt(A);
        }
    }
