/*
35. Print Right-Angled Triangle Pattern of Numbers
Description: Write a program to print a right-angled triangle of numbers.
Input: n = 4


Output:

 1
12
123
1234
*/

public class RightAngledTriangle{
    public static void main(String args[]){
        int num = 4;

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}