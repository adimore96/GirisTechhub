//Write a java program to count number of digits in a number.
import java.util.*;
public class NoOfDigitsInNumApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int rem,count=0,nCpy=num;
		while(num>0){
			count += 1;
			num /= 10;
		}
		System.out.printf("%d contains %d digits",nCpy,count);
	}
}