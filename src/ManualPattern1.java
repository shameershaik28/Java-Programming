public class ManualPattern1 {
    public static void main(String[] args) {

        //outer loop traverse starts with 5 and decreases by 1 each time
        for (int i = 5; i >= 1; i--) {
            //inner loop traverse upto i
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            //It goes to the next lines after printing each row
            System.out.println();
        }
    }
}
