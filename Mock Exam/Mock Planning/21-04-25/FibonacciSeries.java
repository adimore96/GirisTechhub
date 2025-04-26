/*
3. Fibonacci Series
Description: Write a program to print the first n Fibonacci numbers.
Input: n = 5
Output: 0 1 1 2 3
*/

public class FibonacciSeries{
    public static void fibSeries(int num){
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        if(num<=1){
            return;
        }
        for(int i=2; i<num; i++){
            int sum = first+second;
            System.out.print(sum+"  ");
            first=second;
            second = sum;
        }
    }
    public static void main(String args[]){
        int num = 5;

        fibSeries(num);
    }
}