/*
48. Sum of First N Divisible by 3
Description: Write a program to calculate the sum of the first n numbers divisible by 3.
Input: n = 4
Output: 18
*/

public class SumOfFirstDivisible{
    public static void main(String args[]){
        int num = 4;
        int sum = 0;

        for(int i=1; num!=0; i++){
            if(i%3==0){
                sum += i;
                num--;
            }
        }

        System.out.println(sum);

    }
}