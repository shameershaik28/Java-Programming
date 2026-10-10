package patterns;
/*
Problem: Hollow Inverted Pyramid Pattern

Take an integer N as input and print the corresponding pattern.

Example:
Input: N = 5

Output:
*       *
**     **
***   ***
**** **
*********

Note: Underscores in the problem statement represent spaces.
Print actual spaces in the output.
*/
public class HollowInvertedPyramidPattern {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=N; i>=1; i--)
        {
            for(int j=1; j<= (N-i+1); j++)
            {
                System.out.print("*");
            }

            for(int j=1; j<=2*(i-1); j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<= (N-i+1); j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
