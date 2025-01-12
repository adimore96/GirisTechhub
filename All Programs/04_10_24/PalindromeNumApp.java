//Write a java program to check whether a number is palindrome or not.
import java.util.*;
public class PalindromeNumApp{
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
		//System.out.printf("temp: %d rev: %d \n",temp,rev);
		if(temp==rev)
			System.out.printf("%d is a Palindrome",temp);
		else
		System.out.printf("%d is Not a Palindrome",temp);
	}
}