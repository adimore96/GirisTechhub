//WAP to compute sum of an integer digits.

import java.util.*;
public class SumOfDigits{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int sum=0,lastDigit;
		while(num>0){
			lastDigit = num%10;
			sum += lastDigit;
			num /= 10;
		}
		
		System.out.println("Sum of all digits: "+sum);

	}
}