//WAP to input quantity and rate of product using Scanner Class and apply 18% GST on the bill and Calculate the bill.

import java.util.*;
public class GstCalculator{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

	float quantity, rate;
	double gst;
	
	quantity = sc.nextFloat();
	rate = sc.nextFloat();
	
	gst = (rate*quantity)*(18/100);

	System.out.println("GST on the "+quantity+" products is: "+gst);

	}
}