//WAP to input the electricity meter unit and per unit rate and calculate its total bill and if bill is greater than 2000 then give discount 10% otherwise there is no discount.

import java.util.*;

public class EleBillCalculator{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Meter Unit:" );
		int meterUnit = sc.nextInt();
		System.out.print("Enter a Unit Rate:" );
		int unitRate = sc.nextInt();
		System.out.print("Enter a Meter Unit:" );
		
		int totalBill = meterUnit*unitRate;
		System.out.println("Total: "+totalBill);
	
		String result = (totalBill>2000)? "Total Bill with 10% Discount: "+ (totalBill-(totalBill*10/100) ): "Total Bill without Discount: "+totalBill;

	
		System.out.println(result);
	}

}