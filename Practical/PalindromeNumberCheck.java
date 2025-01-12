/*

WAP to check given Number is Palindrom or not using function recursion this progrom for Aditya
*/

import java.util.*;

public class PalindromeNumberCheck{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(checkPalindrome(number)){
			System.out.print(number+" is a Palindrome Number");
		}else{
			System.out.print(number+" is not a Palindrome Number");
		}
	}
	
	public static boolean checkPalindrome(int num){
		if(num<0){
			return false;
		}
		
		int revNum = reverseNum(num);
		
		return isPalindrome(num,revNum);
	}
	
	public static int reverseNum(int num){
		int rev = 0;
		while(num !=0){
			rev = rev*10 + num%10;
			num/=10;
		}
		return rev;
	}
	
	public static boolean isPalindrome(int num,int temp){
		if(num==0){
			return temp==0;
		}
		
		if(num%10 != temp%10){
			return false;
		}
		
		return isPalindrome(num/10,temp/10);
	}
}