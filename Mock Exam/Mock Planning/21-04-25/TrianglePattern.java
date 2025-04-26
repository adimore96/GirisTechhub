/*
22. Print Triangle of Stars
Description: Write a program to print a triangle of stars.
Input: n = 4
Output:
   *
  * *
 * * *
* * * *

*/

public class TrianglePattern{
    public static void main(String args[]){
        int num = 4;

        for(int i=1;i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1;i<=num; i++){
            // white spaces
            for(int j=1; j<= num-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}