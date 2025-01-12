//Write a C program to input principle (amount), time and rate (P, T, R) and find Compound Interest.
/*Compount Interest Formula: Compound Interest = P(1 + R/100)^t
Where,
P is principal amount
R is the rate and
T is the time span
*/
import java.util.*;
public class CompoundInterestCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle Amount: ");
		float p = sc.nextFloat();
		System.out.print("Enter Time(yrs): ");
		float t = sc.nextFloat();
		System.out.print("Enter Rate: ");
		float r = sc.nextFloat();
		
		double amount =  p*Math.pow((1 + r/100),t);
		
		System.out.println("Compound Interest: "+amount);
		
		
	}
}
