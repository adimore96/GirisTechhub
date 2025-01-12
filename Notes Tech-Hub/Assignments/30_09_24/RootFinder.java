//WAP to m to find all roots of a quadratic equation using if else. 
// Formula:  (-b +- Math.sqrt(b * b - 4 * a * c)) / (2 * a)
// Discriminant: (b * b - 4 * a * c)

import java.util.*;
public class RootFinder{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a: ");
		int a = sc.nextInt();
		System.out.print("Input b: ");
		int b = sc.nextInt();
		System.out.print("Input c: ");
		int c = sc.nextInt();
		
		//Find the discriminant to check the type of the roots
		int discriminant = b*b-4*a*c;
		
		if(discriminant>0){
			double root1 = (-b + Math.sqrt(b*b-4*a*c)) / (2*a);
			double root2 = (-b - Math.sqrt(b*b-4*a*c)) / (2*a);
			
			System.out.printf("Two Real and Distinct Roots: \nRoot1: %f\nRoot2: %f",root1,root2);
		}
		else if(discriminant == 0){
			double root1 = -b / (2*a);
			//(both roots are the same)
			System.out.printf("One Real Root: %f",root1);
		}
		else{
			double realPart = -b / (2*a);
			double imaginaryPart = Math.sqrt(-discriminant) / (2*a);
			
			System.out.printf("Roots are complex and imaginary:");
			System.out.println("Root1: "+realPart+" + "+imaginaryPart+"i");
			System.out.println("Root2: "+realPart+" - "+imaginaryPart+"i");
		}
	}
}