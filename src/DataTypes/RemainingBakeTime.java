package DataTypes;

import java.util.Scanner;

/*
Problem: Remaining Bake Time

Question:
The lasagna should be in the oven for 40 minutes.
Given the time (in minutes) the lasagna has been in the oven,
find how many more minutes the lasagna still needs to bake for.
*/

public class RemainingBakeTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int totalTime = 40;
        int actualTime = N;

        System.out.println(totalTime-actualTime);
    }
}
