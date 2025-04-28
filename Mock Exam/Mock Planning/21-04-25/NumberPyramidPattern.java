/*
40. Number Pyramid Pattern
Description: Write a program to print a number pyramid pattern.
Input: n = 4


Output:
   1
  121
 12321
1234321
*/

public class NumberPyramidPattern{
    public static void main(String args[]){
        int num = 4;

        for(int i=1; i<=num; i++){
            // Spaces
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }

            //
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}