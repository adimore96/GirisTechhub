//Write a java program to calculate product of digits of a number.
import java.util.*;
public class ProductOfDigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int rem,prod=1;
		
		while(num>0){
			rem = num%10;
			prod *= rem;
			num /= 10;
		}
		
		System.out.printf("Product of all digits is: %d",prod);
	}
}