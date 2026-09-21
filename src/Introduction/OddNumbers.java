package Introduction;
/*
Problem: Odd Numbers

Question:
Print the first 5 odd numbers i.e. 1, 3, 5, 7, 9 using concatenation operator (+).
*/

public class OddNumbers {
    public static void main(String[] args) {
        int num = 1;
        for (int j = 1; j <=5; j++) {
            if(j==5)
            {
                System.out.print(num);
            }
            else
            {
                System.out.print(num+" ");
                num = num + 2;
            }
        }
    }
}
