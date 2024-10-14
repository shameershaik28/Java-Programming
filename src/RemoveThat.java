import java.util.ArrayList;
import java.util.Scanner;

public class RemoveThat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
         int N = sc.nextInt();
         if(N<=1 || N>100)
         {
             return;
         }
         System.out.println("Enter the index to be deleted: ");
         int X = sc.nextInt();
         X= X-1;

         ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter the elements in the array: ");
         for(int i =0; i<N; i++)
         {
             list.add(sc.nextInt());
         }

        System.out.println("Before deletion: "+ list);
         if(X>=0 && X<list.size())
         {
             list.remove(X);
             System.out.println("After deletion: " + list);
         }
         else
             System.out.println("Invalid Input");
    }
}
