//WAP to input basic salary of employee and calculate its da and hra using following terms and calculate total bill.
//da=30%
//hra=30%

import java.util.*;

public class DaHraCalculator{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		float bs = sc.nextFloat();
		//System.out.println(bs);
		double da = bs*30/100;
		double hra = bs*(30.0/100);
		//System.out.println(da +" "+hra);
		double total = bs+da+hra;

		System.out.println("Basic Salaey: "+bs+"\nTotal Salary: "+total);

	}

}