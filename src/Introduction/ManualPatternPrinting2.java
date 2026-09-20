package Introduction;
/*
Problem: Manual Pattern Printing - 2

Problem Description:
Print the following pattern in output:

    *
   **
  ***
 ****
*****
*/

public class ManualPatternPrinting2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
