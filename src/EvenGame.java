import java.util.Scanner;

public class EvenGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Edge case: N should be between 1 and 1000000
        if(N==0 || N >1000000)
        {
            return;
        }

        //iterating over N to find the even numbers
        for(int i =1; i<=N; i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
