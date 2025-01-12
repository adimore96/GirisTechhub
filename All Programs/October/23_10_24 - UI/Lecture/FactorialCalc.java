//WAP to create a function as void power(int base, int index) and calculate its power.
import java.util.*;
public class FactorialCalc{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		
		int fact = getFact(num);
		System.out.printf("Factorial of %d is %d",num,fact);
	}
	
	public static int getFact(int num){
		int fact=1;
		for(int i=1; i<=num; i++){
			fact = fact*i;
		}
		return fact;
	}
}