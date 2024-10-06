public class ManualPattern {
    public static void main(String[] args) {

         int A = 5;
         for(int i=0; i<5; i++) {
             for(int j=0; j<A; j++) {
                 System.out.print("*");
             }
             System.out.println();
             A--;
         }
         System.out.println();
    }
}
