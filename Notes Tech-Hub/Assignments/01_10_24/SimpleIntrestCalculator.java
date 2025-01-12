//WAP to input principle, time and rate (P, T, R) from user and find Simple Interest. 
//Formula = SI = (P*T*R)/100 : P-Principal_Amount, T:Time(yrs), R:Rate

import java.util.*;
public class SimpleIntrestCalculator{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle Amount: ");
		float p = sc.nextFloat();
		System.out.print("Enter Time(Yrs): ");
		float t = sc.nextFloat();
		System.out.print("Enter Rate: ");
		float r = sc.nextFloat();
		
		
		float si = (p*r*t)/100;
		System.out.println("Simple Interest is: "+si);
	}
}