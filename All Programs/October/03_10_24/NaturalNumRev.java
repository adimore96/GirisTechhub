//Write a java program to print all natural numbers in reverse (from n to 1)
import java.util.*;
public class NaturalNumRev{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number From Display Natural Numbers till 1: ");
		int num = sc.nextInt();
		System.out.println("Natural Numbers form "+num+"to 1:");
		while(num>=1){
			System.out.println(num);
			num--;
		}
	}
}