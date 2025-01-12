//WAP to find Resistance, Current and Voltage.

import java.util.*;
public class ResistanceCalculator{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		float volt = sc.nextFloat();
		float current = sc.nextFloat();

		float resistance = volt/current;

		System.out.println("Resistance is: "+ resistance);


	}
}