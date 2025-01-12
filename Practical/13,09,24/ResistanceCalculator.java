//WAP to find Resistance, Current and Voltage.

import java.util.*;
public class ResistanceCalculator{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
		
			System.out.print("\n\t1.Resistance Calculator.\n\t2.Voltage Calculator.\n\tCurrent Calculator\n3.Enter ur Choice: ");
			int ch = sc.nextInt();
	
			switch(ch){
				case 1:{
					System.out.println("\n\t************************************Resistance Calculator************************************");	
					System.out.print("Enter Voltage: ");
					float volt = sc.nextFloat();
					System.out.print("Enter Current: ");
					float current = sc.nextFloat();

					float resistance = volt/current;

					System.out.println("Resistance is: "+ resistance);
					break;	
				}
				case 2:{
					System.out.println("\n\t************************************Voltage Calculator************************************");	
					System.out.print("Enter Resistance: ");
					float res = sc.nextFloat();
					System.out.print("Enter Current: ");
					float current = sc.nextFloat();

					float volt = res*current;

					System.out.println("Voltage is: "+ volt);
					break;		
				}
				case 3:{
					System.out.println("\n\t************************************Current Calculator************************************");	
					System.out.print("Enter Resistance: ");
					float res = sc.nextFloat();
					System.out.print("Enter Voltage: ");
					float volt = sc.nextFloat();

					float current = volt/res;

					System.out.println("Voltage is: "+ current);
					break;		
				}
				default:{
					System.out.println("Enter Valid Choice!");	
				}

			}
		
		}

	}
}