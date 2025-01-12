/*
3. Check Number Is Duck Number or Not.
	
	Example :
	A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers. 
	Please note that a numbers with only leading 0s is not considered as Duck Number. 
	For example, numbers like 035 or 0012 are not considered as Duck Numbers.
*/

import java.util.*;
public class DuckNumCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int rem;
		boolean isDuck=false;
		
		while(num>0){
			rem = num%10;
			if(rem==0){
				isDuck = true;
				break;
			}
			num /= 10;
		}
		
		if(isDuck)
			System.out.println("Number is Duck");
		else
			System.out.println("Number is Not a Duck");
	}
}