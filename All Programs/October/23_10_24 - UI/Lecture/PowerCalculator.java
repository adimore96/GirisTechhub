//WAP to create a function as void power(int base, int index) and calculate its power.
import java.util.*;
public class PowerCalculator{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter base: ");
		int base = sc.nextInt();
		System.out.print("Enter power: ");
		int power = sc.nextInt();
		
		power(base,power);
	}
	
	public static void power(int base, int power){
		System.out.printf("base:%d power:%d value:%d",base,power,(int)Math.pow(base,power));
	}
}