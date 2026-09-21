package Introduction;
/*
Problem: Print Table of 3

Question:
Print the first five multiples of 3:

3 6 9 12 15
*/

public class PrintTableOf3 {
    public static void main(String[] args) {

        for (int j = 1; j <=5; j++) {
            if(j==5)
                System.out.print(3*j);
            else
                System.out.print(3*j+" ");
        }
    }
}
