/*
20. Sum of Squares of First N Natural Numbers
Description: Write a program to calculate the sum of squares of the first n natural numbers.
Input: n = 3
Output: 14
*/
public class SumOfFirstNaturalNum{
    public static int getSquare(int num){
        return num*num;
    }
    public static void main(String args[]){
        int num = 3;
        int sum = 0;

        for(int i=1; i<=num; i++){
            sum += getSquare(i);
        }

        System.out.println(sum);
        
    }
}