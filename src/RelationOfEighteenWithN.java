import java.util.Scanner;

public class RelationOfEighteenWithN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N>18)
        {
            System.out.println("N is greater than 18");
        }
        else if(N<18)
        {
            System.out.println("N is less than 18");
        }
        else {
            System.out.println("N is equal to 18");
        }

    }
}
