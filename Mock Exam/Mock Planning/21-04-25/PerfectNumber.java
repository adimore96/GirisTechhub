/*
30. Perfect Number
Description: Write a program to check if a number is perfect.
Input: n = 6
Output: Perfect

A perfect number is a positive number that is equal to the sum of its proper divisors, excluding itself.
*/

public class PerfectNumber{
    public static void main(String args[]){
        int num = 28;
        int temp = num, sum=0;

        for(int i=1; i<=num/2; i++){
            if(num%i==0){
                sum += i;
            }
        }
        
        if(sum==temp){
            System.out.print("Perfect Number");
        }else{
            System.out.print("Not a Perfect Number");            
        }
    }
}