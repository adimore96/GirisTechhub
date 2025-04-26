/*
11. Even Numbers
Description: Write a program to print all even numbers between 1 and n.
Input: n = 10
Output: 2 4 6 8 10
*/

public class EvenNoPrint{

    public static void main(String args[]){
        int num = 10;

        for(int i=1; i<=num; i++){
            if(i%2==0){
                System.out.print(i+"  ");
            }
        }
    }
}