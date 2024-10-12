import java.util.Scanner;

public class TheSquaredSumGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;

        for(int i =1; i<=5; i++)
        {
            int squaredValues= sc.nextInt();
            sum = sum + squaredValues*squaredValues;

        }
        System.out.println(sum);
    }
}
