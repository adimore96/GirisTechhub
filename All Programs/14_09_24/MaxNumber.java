//Q1. Write a java program to find maximum between two numbers.

import java.util.*;
public class MaxNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		String result = (num1>num2)?num1 + " is Greater" : num2 +" is Grteater";
		System.out.print(result);
	}
}