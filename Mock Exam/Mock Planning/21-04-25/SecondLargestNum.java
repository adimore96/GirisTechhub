/*
25. Find the Second Largest Number
Description: Write a program to find the second largest number from a set of two numbers.
Input: a = 10, b = 20
Output: 10
*/

public class SecondLargestNum{
    public static void main(String args[]){
        int a = 10, b = 20;
        if(a>b){
            System.out.print(b);
        }else{
            System.out.print(a);
        }
    }
}