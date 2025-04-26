/*
9. Sum of Digits
Description: Write a program to calculate the sum of digits of a given number.
Input: n = 234
Output: 9
*/

public class SumOfDigits{

    public static void main(String args[]){

        int num = 234;
        int sum = 0;

        while(num>0){
            int rem = num%10;
            sum += rem;
            num/=10;
        }

        System.out.println("Sum: "+sum);
    }
}