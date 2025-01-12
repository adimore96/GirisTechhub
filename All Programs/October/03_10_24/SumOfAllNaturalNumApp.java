//Write a java program to find sum of all natural numbers between 1 to n.
import java.util.*;
public class SumOfAllNaturalNumApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		int i=1,sum=0;
		while(i<=num){
			sum += i;
			i++;
		}
		
		System.out.printf("Sum of all Natural numbers between 1 to %d is: %d",num,sum);
	}
}