//Write a java program to calculate sum of digits of a number.
import java.util.*;
public class SumOfDigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int rem,sum=0;
		
		while(num>0){
			rem = num%10;
			sum += rem;
			num /= 10;
		}
		
		System.out.printf("Sum of all digits is: %d",sum);
	}
}