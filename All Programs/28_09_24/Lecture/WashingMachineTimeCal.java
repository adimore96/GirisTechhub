//WAP to estimate the time require by the washing machine if you give weight above 7kg then print "Overfull" if you 
//give weight 0-2000kg diplay time "25 Minutes"  2001-4000 display time "35 Minutes"
//4000> time "45 Minutes"
//max Capacity 7000> display "OVERLOADED"
//Other input Display "Invalid Input"

import java.util.*;
public class WashingMachineTimeCal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Weight: ");
		int weight = sc.nextInt();
		
		if(weight>7000){
			System.out.println("OVERLOADED");
		}
		else if(weight>0 && weight<=2000){
			System.out.println("25 Minutes");
		}
		else if(weight>=2001 && weight<=4000){
			System.out.println("35 Minutes");
		}
		else if(weight>4000){
			System.out.println("45 Minutes");
		}
		else if(weight==0){
			System.out.println("0 Minutes");
		}
		else{
			System.out.println("Invalid Input!");
		}
	}
}