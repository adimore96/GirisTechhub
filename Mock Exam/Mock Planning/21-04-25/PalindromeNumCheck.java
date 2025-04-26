/*
5. Palindrome Number
Description: Write a program to check if a number is a palindrome.
Input: n = 121
Output: Palindrome
*/

public class PalindromeNumCheck{

    public static void main(String args[]){
        int num = 121;

        int temp = num;
        int revNum = 0;

        while(num>0){
            int rem = num%10;
            revNum = revNum*10 + rem;
            num /= 10;
        }

        if(revNum==temp){
            System.out.println("Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}