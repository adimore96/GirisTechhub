/*
8. Multiplication Table
Description: Write a program to print the multiplication table for a number n.
Input: n = 4
Output: 4 8 12 16 20
*/

public class Multiplicationtable{

    public static void displayTable(int num){
        for(int i=1; i<=10; i++){
            System.out.print((num*i)+" ");
        }
    }

    public static void main(String args[]){
        int num = 4;
        displayTable(num);
    }
}