import java.util.Scanner;

public class GCD {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int A = sc.nextInt();
         int B = sc.nextInt();
         int GCD = 0;

         for(int i =1; i<=A && i<=B; i++){
             if(A%i==0 && B%i==0){
                 GCD = i;
             }
         }
         System.out.println(GCD);
}
}
