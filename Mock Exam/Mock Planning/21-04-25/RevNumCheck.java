/*
7. Reverse a Number
Description: Write a program to reverse the digits of a given number.
Input: n = 12345
Output: 54321
*/

public class RevNumCheck{

    // Logic for swap the first and last digit. :)
    public static void swapDigit(int num){
        
        int temp = num, divisor=1;

        while(num>0){
            divisor *= 10;
            num /= 10;
        }
        divisor /= 10;
        num = temp;
        int lastDigit = num%10;
        int firstDigit = num/divisor;
        int middle = (num%divisor)/10;
        // System.out.println(middle);
        
        System.out.println("Two digit swapped Num: "+(lastDigit*divisor + middle*10+ firstDigit*1));
    }

    public static void main(String args[]){
        int num = 52345;

        // swap first and lastDigit
        swapDigit(num);

        // other and simple shortest method
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num/=10;
        }
        System.out.println("Reverse Number: "+rev);
    }
}