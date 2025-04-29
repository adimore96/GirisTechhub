/*
50. Find Greatest Common Divisor (GCD)
Description: Write a program to find the greatest common divisor (GCD) of two numbers.
Input: a = 15, b = 12
Output: 3
*/

public class GCD{

    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }

    public static void main(String args[]){
        int a=15, b= 12;
        System.out.println(gcd(a,b)); 
    }
}