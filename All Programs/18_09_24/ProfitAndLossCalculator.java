//Write a java program to input cost price and selling price of a product and check profit or loss.

import java.util.*;

public class ProfitAndLossCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Cost Price: ");
		int costPrice = sc.nextInt();
		System.out.print("Enter Selling Price: ");
		int sellingPrice = sc.nextInt();
		
		
		if(costPrice==sellingPrice){
			System.out.println("No profit no Loss");
		}
		else if(costPrice<sellingPrice){
			System.out.println("Profit of: "+(sellingPrice-costPrice));
		}
		else{
			System.out.println("Loss of: "+(costPrice-sellingPrice));
		}
	}
}