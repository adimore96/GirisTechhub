/*
Given a five digit integer, print the sum of its digits.
Input Format

The input contains a single five digit number, n
Constraints
10000<=n<=99999
Output Format
Print the sum of the digits of the five digit number.
Sample Input 0
10564
Sample Output 0
16
*/

import java.util.*;
public class SumOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five digit num: ");
        int n = sc.nextInt();

        if(n<10000 || n>99999){
            System.out.print("Enter five digit number...!");
            return;
        }

        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        System.out.println(sum);
    }
}