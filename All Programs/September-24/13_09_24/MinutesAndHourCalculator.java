//WAP to convert seconds into hour, minutes and seconds.

import java.util.*;
public class MinutesAndHourCalculator{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Second's: ");
		int sec = sc.nextInt();
		
		int hour = sec/3600;
		int minutes = sec/60;
		System.out.println("Hour is: "+ hour);
		System.out.println("Minute is: "+ minutes);
		System.out.println("Second is: "+ sec);


	}
}