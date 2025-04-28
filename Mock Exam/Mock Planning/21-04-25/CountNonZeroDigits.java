/*
47. Count Non-Zero Digits
Description: Write a program to count the number of non-zero digits in a number.
Input: n = 1203
Output: 3
*/

public class CountNonZeroDigits{
    public static void main(String args[]){
        int num = 1203;
        int count = 0;

        while(num>0){
            if(num%10!=0) count++;
            num /= 10;
        }

        System.out.println(count);
    }
}