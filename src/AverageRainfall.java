import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int N = sc.nextInt();

        int[] rainfall= new int[N];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < N; i++){
            rainfall[i] = sc.nextInt();
        }

        double sum =0;
        for(int i = 0; i < N; i++){
            sum+=rainfall[i];
        }

        System.out.println("This is the total sum of the rainfall : "+ sum);
        double NUM= sum/N;

        System.out.println("Average rainfall is : "+ NUM);

        System.out.println("Floor value is : "+ Math.floor(NUM));


    }
}
