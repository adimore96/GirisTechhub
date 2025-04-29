/*
62. Sum of First N Perfect Squares
Description: Write a program to calculate the sum of the first n perfect squares.
Input: n = 4
Output: 30
*/

public class SumOfNPerfectSquare{
    public static void main(String args[]){
        int num = 4;
        int sum = 0;

        for(int i=1; i<=num; i++){
            sum += i*i;
        }

        System.out.println(sum);
    }
}