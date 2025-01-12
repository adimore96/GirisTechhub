/*Q 1. Write a java program to check number is neon or not.

		A neon number is a number where the sum of digits of the square of the number is equal to the number.
		
		Example : - Input Number Is : 9
						Square Of    9 * 9 = 81
						Sum Of        8 + 1 = 9
						
*/

import java.util.*;
public class NeonNumberCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int squr = num*num;
		
		int sum=0,rem=0;
		
		while(squr>0){
			rem = squr%10;
			sum = sum+ rem;
			squr /= 10;
		}
		
		//System.out.print("Sum: "+sum);
		
		if(num == sum){
			System.out.println("Number is Neon");
		}
		else{
			System.out.println("Number is not Neon");
		}
		
	}
}