/*
4. Check Number Is Strong Number or Not.
	
	Example :
	A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
*/

import java.util.*;
public class StrongNumCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int totSum=0,fact=1,temp = num;
		
		while(num>0){
			int rem = num%10;
			fact = 1;
			while(rem>0){
				fact *= rem;
				rem--;
			}
			totSum += fact;
			num /= 10;
		}
		
		if(totSum == temp){
			System.out.printf("%d is a Strong Number.",temp);
		}
		else{
			System.out.printf("%d is a Not a Strong Number.",temp);
		}
	}
}