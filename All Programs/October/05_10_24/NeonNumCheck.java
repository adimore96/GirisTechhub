/*
	6. Check Number Is Neon Number or Not.
	Example :
	A neon number is a number where the sum of digits of square of the number is equal to the number. 
	let's consider the number 9. When squared, we get 81. The sum of the digits in 81 is 8 + 1 = 9, 
	which matches the original number. Therefore, 9 is a Neon Number.
*/

import java.util.*;
public class NeonNumCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int square = (int)Math.pow(num,2);
		int rem,totalSum=0;
		
		while(square>0){
			rem = square%10;
			totalSum += rem;
			square /= 10;
		}
		
		if(totalSum == num){
			System.out.printf("%d is a Neon Number",num);
		}
		else{
			System.out.printf("%d is Not a Neon Number",num);
		}
		
		
	}
}