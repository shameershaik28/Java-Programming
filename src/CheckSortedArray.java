import java.util.Scanner;

public class CheckSortedArray {
    public int sortedArray(int[] nums) {
        int N = nums.length;
        for(int i = 0; i < N-1; i++)
        {
            if(nums[i]>nums[i+1])
            {
                return 0;
            }
        }
        return 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        CheckSortedArray check = new CheckSortedArray();
        System.out.println(check.sortedArray(arr));

    }
}
