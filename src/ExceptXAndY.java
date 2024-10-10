import java.util.Scanner;

public class ExceptXAndY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

     if(A<=B || A<=X || B<=Y){
        for(int i =A; i<=B ; i++)
        {
            if(i!=X && i!=Y)
            {
                System.out.print(i+" ");
            }

        }
    }
}
}
