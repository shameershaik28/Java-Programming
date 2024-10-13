import java.util.Scanner;

public class InsertThat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the size of the array
        int N = sc.nextInt();
        int[] arr = new int[N + 1];  // Create an array of size N+1

        // Reading the elements of the array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Reading the 1-based index and the element to insert
        int index = sc.nextInt();
        int element = sc.nextInt();

        // Convert the 1-based index to 0-based for array operations
        index = index - 1;

        // Shifting elements to the right to make space for the new element
        for (int i = N; i > index; i--) {
            arr[i] = arr[i - 1];  // Shift elements to the right
        }

        // Insert the new element at the adjusted 0-based index
        arr[index] = element;

        // Printing the updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
