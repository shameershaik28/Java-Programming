package Introduction;

/*
Problem: Manual Pattern Printing - 1

Problem Description:
Print the following pattern:

*****
****
***
**
*

*/
public class ManualPatternPrinting1 {

    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
