package Introduction;
/*
Problem: Print Table of 3 Detailed

Question:
Print the first five multiples of 3 in the following manner:

3*1 = 3
3*2 = 6
3*3 = 9
3*4 = 12
3*5 = 15
*/

public class PrintTableOf3Detailed {
    public static void main(String[] args) {
        int num = 3;
        for (int j = 1; j <= 5; j++) {
            System.out.println("3*"+j+" = "+ num*j);
        }
    }
}
