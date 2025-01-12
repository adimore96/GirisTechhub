//Write a java program to find sum of all even numbers between 1 to n.
import java.util.*;
public class SumOfAllEvenNumApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int i=1,sum=0;
		while(i<=num){
			if(i%2==0){
				sum += i;
			}
			i++;
		}
		System.out.printf("Sum of all Even numbers between 1 to 100 is: %d",sum);
	}
}