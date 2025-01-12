//Write a java program to find maximum between two numbers.
import java.util.*;

public class MaxNumberFinder{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		if(num1>num2){
			System.out.println(num1+" is Gtreater than "+num2);
		}
		else{
			System.out.println(num2+" is Gtreater than "+num1);
		}
	}
}