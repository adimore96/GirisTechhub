// Q3.Write a java program to check whether triangle is valid or not.

import java.util.*;
public class TriangleValidator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first side: ");
		int fs = sc.nextInt();
		
		System.out.print("Enter second side: ");
		int ss = sc.nextInt();
		
		System.out.print("Enter third side: ");
		int ts = sc.nextInt();
		
		String result = ((fs+ss+ts)==180 && (fs+ss+ts)>0 &&fs>0 && ss>0 && ts>0) ? "It is a valid Triangel!":"It is not a valid Triangel!";
		System.out.println(result);
	}
}