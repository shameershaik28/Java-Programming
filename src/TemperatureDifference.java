import java.util.Scanner;

public class TemperatureDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();

        if(N==0)
        {
            return;
        }

        int[] temp= new int[N];

        System.out.println("Enter the elements in the array: ");
        for(int i =0; i<N; i++)
        {
            temp[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i =0; i<N; i++)
        {
            if(temp[i]>max)
            {
                max = temp[i];
            }

            if(temp[i]<min)
            {
                min = temp[i];
            }
        }
        System.out.println("Max value is : " + max);
        System.out.println("Min value is : " + min);
        System.out.println(max-min);

    }
}
