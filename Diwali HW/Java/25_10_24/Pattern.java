/*
 1        1
 12      21
 123    321
 1234  4321
 1234554321
 */
public class Pattern {
    public static void main(String[] args) {
        int num=5;

        for (int i = 1; i <= num; i++) {
            // Ascending Order
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }

            // Spaces
            for(int j=1; j<=((num*2)-(i*2))*2; j++){
                System.out.print(" ");
            }

            // Descending Order
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
