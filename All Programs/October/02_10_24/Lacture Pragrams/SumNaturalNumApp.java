//WAP to sum of all natural numbers between 1-10.

import java.util.*;
public class SumNaturalNumApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the number: ");
		//int num = sc.nextInt();
		int i=1,sum=0;
		while(i<=10){
			sum += i;
			i++;
		}
		System.out.printf("Sum is: %d",sum);
	}
}