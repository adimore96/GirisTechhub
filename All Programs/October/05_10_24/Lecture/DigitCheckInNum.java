//WAP to input a number and a digit and check whether the diigit is in number or not.

import java.util.*;
public class DigitCheckInNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		System.out.print("Enter a Digit: ");
		int digit = sc.nextInt();
		int rem;
		boolean isFound=false;
		
		while(num>0){
			rem = num%10;
			if(digit==rem){
				isFound = true;
				break;
			}
			num /= 10;
		}
		
		if(isFound)
			System.out.print("Digit is Found in number");
		else
			System.out.print("Digit is Not Found in number");
	}
}