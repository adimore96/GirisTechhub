//  Write a java program to check whether a number is palindrome or not.

import java.util.*;

public class NumPalindromeChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int numCpy = num, rev=0,rem=0;
		
		while(num>0){
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		System.out.println("Rev: "+rev);
		
		if(rev == numCpy){
			System.out.println(numCpy+" is a Palindrome");
		}
		else{
			System.out.println(numCpy+" is not a Palindrome");
		}
		
		
	}
}