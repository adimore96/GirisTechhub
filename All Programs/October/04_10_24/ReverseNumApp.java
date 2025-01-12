//Write a java program to enter a number and print its reverse.
import java.util.*;
public class ReverseNumApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num, rem,rev=0;
		
		while(num>0){
			rem = num%10;
			rev = rev*10 +rem;
			num /= 10;
		}
		
		System.out.printf("Reverse of %d is: %d",temp,rev);
	}
}