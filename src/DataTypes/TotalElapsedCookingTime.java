package DataTypes;

/*
Problem: Total Elapsed Cooking Time

Question:
The preparation time of one layer is 2 minutes.
Given the number of layers added to the lasagna and the number
of minutes the lasagna has been baking in the oven, find the
total elapsed cooking time (prep + bake) in minutes.
*/

import java.util.Scanner;

public class TotalElapsedCookingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int layers = N * 2;

        System.out.println(M + layers);
    }
}
