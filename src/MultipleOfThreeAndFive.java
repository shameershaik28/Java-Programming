import java.util.Scanner;

public class MultipleOfThreeAndFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  A  = sc.nextInt();
        if(A==0)
        {
            return;
        }

        int sum =0;
        for(int i =1; i<=A; i++)
        {
           if(i%3==0 || i%5==0)
           {
               sum +=i;
           }
        }
        System.out.println(sum);
    }
}
