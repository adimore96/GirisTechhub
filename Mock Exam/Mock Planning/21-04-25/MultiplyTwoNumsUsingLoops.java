/*
26. Multiplication of Two Numbers
Description: Write a program to multiply two numbers using loops.
Input: a = 3, b = 5
Output: 15
*/

public class MultiplyTwoNumsUsingLoops{
    public static void main(String args[]){
        int a=3, b=5;
        int result = 0;
        for(int i=0; i<a; i++){
            result += b;
        }

        System.out.println(result);
    }
}