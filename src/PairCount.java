import java.util.ArrayList;
import java.util.Scanner;

public class PairCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        System.out.println("Enter the Integer B: ");
        int B = sc.nextInt();


        ArrayList<Integer> A = new ArrayList<Integer>();

       System.out.println("Enter the elements in the array: ");
        for(int i=0; i<N ; i++)
        {
            A.add(sc.nextInt());
        }
        int count =0;
        for(int i=0; i<N ; i++)
        {

            for(int j=i+1; j<N; j++)
            {
                if(A.get(i)+A.get(j)==B)
                {
                    count++;
                }
            }
        }
        System.out.println("The total count values which are equalss to B are : "+ count);
    }
}

