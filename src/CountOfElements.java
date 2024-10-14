import java.util.Scanner;

public class CountOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // If N is less than 1, exit the program
        if (N < 1) {
            return;
        }

        // Create an array of size N
        int[] arr = new int[N];

        // Read the input elements and store them in the array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();  // Store the input value in arr[i]
        }

        int max = Integer.MIN_VALUE;


        // Loop through the array to find the number of elements greater than the current max
        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update the max to the current element

            }
        }

        // Step 2: Count how many elements are equal to the maximum
        int countOfMax = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == max) {
                countOfMax++;
            }
        }

        // Output the number of elements that are not the maximum
        System.out.println(N - countOfMax);
    }
}
