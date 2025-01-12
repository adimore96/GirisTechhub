/*
 WAP to create function name as 
   int getRev(int no): this function can accept number as parameter and reverse it and return it.

 */

import java.util.Scanner;

public class ReverseNum {
    public static int rev=0;
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        System.out.printf("%d reverse number is %d", num, getRev(num));
    }

    public static int getRev(int num){
        int rem;
        if(num>0){
            rem = num%10;
            rev = rev*10 + rem;
            num /= 10;
            getRev(num);
        }
        return rev;
    }
}
