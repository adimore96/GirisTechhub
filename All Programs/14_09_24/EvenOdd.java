//	Q2.Write a java program to check whether number is even or odd.

import java.util.*;
public class EvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		
		String result = (num%2==0)? "Number is Even" : "Number is Odd" ;
		
		System.out.println(result);
	}
}