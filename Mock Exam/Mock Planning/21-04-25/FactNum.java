/*
2. Factorial of a Number
Description: Write a program to compute the factorial of a given number n.
Input: n = 4
Output: 24
*/


public class FactNum{
    public static int getFact(int num){
        int fact=1;
        for(int i=num; i>=1; i--){
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
        int num = 4;
        System.out.println(getFact(num));
    }
}