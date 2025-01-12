//Write a java program to check whether a year is leap year or not.
import java.util.*;
public class LeapYearCheck{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
		if( (year%4==0 &&year%100!=0) || year%400 ==0){
			System.out.println(year+" is a leap year!");
		}
		else{
			System.out.println(year+" is not a leap year!");
		}
	}
}