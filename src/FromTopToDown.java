import java.util.Scanner;

public class FromTopToDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //edge case
        if(N==0 || N >1000000)
         {
           return;
         }
        //Iterating from 1 to the ith index
        for(int i =1; i<=N; i++){
            System.out.print(i+" ");
        }
    }
}
