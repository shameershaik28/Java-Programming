import java.util.Scanner;

public class FirstBikeService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Readings = sc.nextInt();
        int Time = sc.nextInt();

        if(Readings >=500 && Readings<=1000000000 || Time >=3){
            System.out.println("Eligible for the service");
        }
        else
        {
            System.out.println("Not eligible for the service");
        }
    }
}
