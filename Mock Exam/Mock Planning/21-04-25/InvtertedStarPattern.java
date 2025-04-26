/*
23. Print Inverted Star Pattern
Description: Write a program to print an inverted star pattern.
Input: n = 4
Output:
 ****
***
**
*

*/

public class InvtertedStarPattern{
    public static void main(String args[]){
        int num = 4;

        for(int i=num; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}