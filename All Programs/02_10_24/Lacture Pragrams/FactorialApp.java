//WAP to input a number and find its factorial.

import java.util.*;
public class FactorialApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int fact=1,rem,ncpy=num;
		while(num>0){
			fact *= num;
			
			num--;
		}
		System.out.printf("Factorial of %d is %d",ncpy,fact);
	}
}