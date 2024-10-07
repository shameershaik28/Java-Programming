import java.util.Scanner;

public class PreparationTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Layers = sc.nextInt(); //Each Layer1
        int eachLayerTime= 2; // In minutes

        System.out.println("It will Take "+ eachLayerTime*Layers+" Minutes for The Preparation Of Gorgeous Lasagna"); // Total Time for the preparation

    }
}
