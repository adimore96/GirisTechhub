/*
2. Check Number Is Perfect Number or Not.
	
	Example :
	perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6, 
	which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
*/
import java.util.*;
public class PerfectNumCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int sumDivisor=0;
		int i=1, temp=num;
		while(i<=(num/2)){
			if(num%i==0){
				sumDivisor = sumDivisor + i;
				//System.out.println("Inside if: "+sumDivisor);
			}
			i++;
		}
		//System.out.println("Outside if: "+sumDivisor);
		if(temp==sumDivisor){
			System.out.print("Number is Perfect");
		}
		else{
			System.out.print("Number is Not Perfect");
		}
	}
}