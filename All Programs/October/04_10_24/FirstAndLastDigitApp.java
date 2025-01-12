//Write a java program to find first and last digit of a number.
import java.util.*;
public class FirstAndLastDigitApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num, rem;
		
		int lastDigit = num%10;
		int firstDigit=0;
		
		while(num>0){
			rem = num%10;
			num/=10;
			if(num==0){
				firstDigit = rem;
				break;
			}
		}
		
		System.out.printf("First Digit:%d and Last Digit:%d",firstDigit,lastDigit);
		
	}
}