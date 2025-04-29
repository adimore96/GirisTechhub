/*
52. Find Least Common Multiple (LCM)
Description: Write a program to find the least common multiple (LCM) of two numbers.
Input: a = 12, b = 15
Output: 60
*/

public class LCM{

    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }
    public static void main(String args[]){
        int a = 15, b = 12;

        int lcm = (a*b)/gcd(a,b);

        System.out.println(lcm);
    }
}