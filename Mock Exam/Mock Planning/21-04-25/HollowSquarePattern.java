/*
Print Hollow Square
Description: Write a program to print a hollow square pattern.
Input: n = 5
Output:
*****
*   *
*   *
*   *
*****
*/

public class HollowSquarePattern{
    public static void main(String args[]){
        int num = 5;

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                if(i==1||i==num){
                    System.out.print("*");
                }
                else if(j==1 || j==num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}