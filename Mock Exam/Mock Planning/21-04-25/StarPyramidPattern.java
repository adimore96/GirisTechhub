/*
44. Print Star Pyramid
Description: Write a program to print a pyramid using stars.
Input: n = 5
Output:

    *
   ***
  *****
 *******
*********

*/

public class StarPyramidPattern{
    public static void main(String args[]){
        int num = 5;

        for(int i=1; i<=num; i++){
            for(int j=1; j<= num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}