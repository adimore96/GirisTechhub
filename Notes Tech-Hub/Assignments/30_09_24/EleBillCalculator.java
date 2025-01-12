/*
Write a C program to input electricity unit charge and calculate the total
electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.
How to calculate electricity bill using if else in C programming. Program to
find electricity bill using if else in C. Logic to find net electricity bill in C
program.
*/

import java.util.*;
public class EleBillCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total Units: ");
		int units = sc.nextInt();
		double billAmount = 0;
		
		//Yeh hai Aam Zindagi
		/*
		if(units>0 && units<=50){
			double charge = units*(0.50);
			double subChargeCalc = (charge * 20)/100;
			System.out.printf("Electricity Bill for %d units is: %.2fRs. \nwith Additional 20%% Subcharge: %.2fRs.",units,charge,(charge+subChargeCalc));
		}
		else if(units>50 && units<=100){
			double charge = units*(0.75);
			double subChargeCalc = (charge * 20)/100;
			System.out.printf("Electricity Bill for %d units is: %.2fRs. \nwith Additional 20%% Subcharge: %.2fRs.",units,charge,(charge+subChargeCalc));
		}
		else if(units>100 && units<=250){
			double charge = units*(1.20);
			double subChargeCalc = (charge * 20)/100;
			System.out.printf("Electricity Bill for %d units is: %.2fRs. \nwith Additional 20%% Subcharge: %.2fRs.",units,charge,(charge+subChargeCalc));
		}
		else if(units>250){
			double charge = units*(1.50);
			double subChargeCalc = (charge * 20)/100;
			System.out.printf("Electricity Bill for %d units is: %.2fRs. \nwith Additional 20%% Subcharge: %.2fRs.",units,charge,(charge+subChargeCalc));
		}
		else{
			System.out.println("Enter valid units!");
		}
		*/
		
		//Yeh hai Mentos Zindagi
		if(units<=50){
			billAmount = (0.50*units);
		}
		else if(units<=150){
			billAmount = (0.50*50) + (units-50)*0.75;
		}
		else if(units<=250){
			billAmount = (0.50*50) + (0.75*100) + (units-150)*1.20;
		}
		else if(units>250){
			billAmount = (0.50*50) + (0.75*100) + (1.20*100) + (units-250)*1.50;
		}
		
		//Add 20% Subcharge
		double subCharge = 0.20*billAmount;
		double totalAmount = subCharge+billAmount;
		
		//Print total Bill
		System.out.println("Bill Amount is: "+billAmount+"\n20% Subcharge which is: "+subCharge+"\nTotal Electricity Bill is: "+totalAmount);
		
	}
}