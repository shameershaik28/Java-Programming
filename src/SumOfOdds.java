import java.util.Scanner;

public class SumOfOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int sum = 0;

        for(int i =1; i<=A; i++){
            if(i%2!=0)
            {
              sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
