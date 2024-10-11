import java.util.Scanner;

public class Square {
    public int SquareIt(int A)
    {
       for(int i =1;i*i<=A;i++)
        {
            if(A==i*i)
            {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        Square square = new Square();
        System.out.println(square.SquareIt(A));
    }
}
