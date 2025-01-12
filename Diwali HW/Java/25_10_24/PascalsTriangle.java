/*
     * 
    * *
   * * *
  * * * *
 * * * * *
* * * * * *
 */

 /*
     1 
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
  */

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows=6;


        // Start Pattern
        for(int i=0; i<numRows; i++){
            // For white spaces
            for(int j=0; j<numRows-i; j++){
                System.out.print(" ");
            }

            // Printing Stars
            int number = 1;
            for(int j=0; j<=i; j++){
                System.out.print(number+" ");
                number = number * (i - j) / (j + 1); 
            }
            System.out.println();
        }


        // Pascals Pattern

        
    }
}
