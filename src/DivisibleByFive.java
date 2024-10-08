import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N >=0 && N%5==0)
        {
            System.out.println("Divisible by five");
        }
        else {
            System.out.println("Not divisible by five");
        }
    }
}
