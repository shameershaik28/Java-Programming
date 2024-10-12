import java.util.Scanner;

public class FrequencyOfXInAnArray {
    public void Freq(int[] arr, int B)
    {
        int l = arr.length;
        int count = 0;

        for(int i=0; i<l; i++)
        {
            if(arr[i]==B)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        int[] arr = new int[N];

        for(int i =0; i<N; i++)
        {
            int A = sc.nextInt();
            arr[i] = A;
        }
        FrequencyOfXInAnArray obj = new FrequencyOfXInAnArray();
        obj.Freq(arr, B);

    }
}
