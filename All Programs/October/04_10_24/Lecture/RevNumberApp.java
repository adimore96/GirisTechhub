//WAP to input a number and reverse it.
import java.util.*;
public class RevNumberApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a number: ");
		int num = sc.nextInt();
		int temp = num, rev=0, rem;
		
		while(num>0){
			rem = num%10;
			rev = rev*10 + rem;
			num /= 10;
		}
		System.out.printf("%d reverse of it is: %d",temp,rev);
	}
}