import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();

        int[] A = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            int count =0;
            for(int j = 0; j < N; j++){
                if(A[i] == A[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println("The Unique Element is : "+ A[i]);
                break;
            }
        }
    }
}
