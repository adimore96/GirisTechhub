/*
 Check Number Is Spy Number or Not.
	 
	 Example :
	 A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits. 


    Input : 1412
    Output : Spy Number
    Explanation : 
    sum = (1 + 4 + 1 + 2) = 8
    product = (1 * 4 * 1 * 2) = 8
    since, sum == product == 8
*/

import java.util.*;
public class SpyNumCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int totalSum=0, totalProd=1, temp=num, rem;
		
		while(num>0){
			rem = num%10;
			totalProd *= rem;
			num /= 10;
		}
		
		num = temp;
		
		while(num>0){
			rem = num%10;
			totalSum += rem;
			num /= 10;
		}
		
		if(totalProd == totalSum)
			System.out.println(temp+" is a Spy Number");
		else
			System.out.print(temp+" is not a Spy Number");
	}
}