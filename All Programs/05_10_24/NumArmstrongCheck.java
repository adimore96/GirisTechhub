/*
5. Check Number Is Armstrong Number or Not.
	
	Example :
	A number is thought of as an Armstrong number if the sum of its own digits raised to the cube number of digits gives the number itself. 
	For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit 
	Armstrong numbers and there are many more.
*/

import java.util.*;
public class NumArmstrongCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int rem=0,total=0,temp=num,counter=0;
		
		while(num>0){
			counter++;
			num /= 10;
		}
		num = temp;
		while(num>0){
			rem = num%10;
			total += Math.pow(rem,counter);
			num /= 10;
		}
		
		if(temp==total){
			System.out.printf("%d is a Armstrong Number.",temp);
		}
		else{
			System.out.printf("%d is Not a Armstrong Number.",temp);
		}
		
	}
}