/*
Q 2. Write a java program to check number is spy or not.
		A number is said to be a Spy number, if the sum of the digits of the given number is equal to the 
		product of the digits of the given number.
		Example : Input Number Is : 123
						The sum of the digits of 123 = 1 + 2 + 3 = 6
						The product of the digits of 123 = 1 * 2 * 3 = 6			
		Note : Without Using Looping
*/

import java.util.*;
public class SpyNumChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int temp1 = num;
		
		int sum=0, rem=0;
		
		// Sum of Digits: 
		rem = num%10;  // First Iteration
		sum = sum+rem;
		num /= 10;    
		
		rem = num%10;  // Second Iteration
		sum = sum+rem;
		num /= 10;   

		rem = num%10;  // Third Iteration
		sum = sum+rem;
		num /= 10;   

		System.out.println("Sum of digits: "+sum);
		
		// Product of Digits: 
		int prod=1;
		rem=0;
		
		rem = temp%10;  // First Iteration
		prod = prod*rem;
		temp /= 10;
		
		rem = temp%10;  // Second Iteration
		prod = prod*rem;
		temp /= 10;
		
		rem = temp%10;  // Third Iteration
		prod = prod*rem;
		temp /= 10;
		
		System.out.println("Product of digits: "+prod);
		
		if(sum == prod){
			System.out.println(temp1+" is a Spy Number");
		}
	}
}