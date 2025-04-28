/*
42. Find the Factorial Using While Loop
Description: Write a program to calculate the factorial of a number using a while loop.
Input: n = 5


Output: 120
*/

public class FactorialOfNumber{
    public static void main(String args[]){

        int num = 5;
        int fact = 1;
        while(num>0){
            fact *= num--;
        }

        System.out.println(fact);
    }
}