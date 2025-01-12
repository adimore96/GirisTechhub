//    Q5 . Write a java program to check whether a number is divisible by 5 and 11 or not.

import java.util.*;

public class NumDivisibilityCheck{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		//String result = (num%5==0 && num%11==0)? "Number "+num+" is divisible by 5 & 11":"Number "+num+" is not divisible by 5 & 11";
		String result = (num%5==0 && num%11==0)? "Number "+num+" is divisible by 5 & 11":(num%5==0 &&num%11!=0)?"Number "+num+" is only divisible by 5":(num%11==0)?"Number "+num+" is only divisible by 11":"Number "+num+" is not divisible by 5 & 11";
		
		System.out.println(result);
	}

}