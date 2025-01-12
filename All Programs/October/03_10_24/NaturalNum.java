//1.Write a java program to print all natural numbers from 1 to n.
import java.util.*;
public class NaturalNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number till Display Natural Numbers: ");
		int num = sc.nextInt();
		System.out.println("Natural Numbers form 1 to "+num+":");
		int i=1;
		while(i<=num){
			System.out.println(i);
			i++;
		}
	}
}