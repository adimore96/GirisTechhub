/*
1.  Check Number Is Prime Number or Not.
	
	Example :
	A prime number is a number that can only be divided by itself and 1 without remainders. 
	The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
*/

import java.util.*;
public class CheckPrimeNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		boolean isPrime = false;
		int i=2;
		while(i<=(num/2)){
			if(num%i==0){
				isPrime = true;
				break;
			}
			i++;
		}
		
		if(!isPrime){
			System.out.print("Number is Prime");
		}
		else{
			System.out.print("Number is Not a Prime");
		}
		
	}
}
	