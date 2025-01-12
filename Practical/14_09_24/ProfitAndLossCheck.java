// Calculate profit and loss using ternary operator

import java.util.*;

public class ProfitAndLossCheck{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a cost: ");
		int cost = sc.nextInt();
		System.out.print("Enter a selling price: ");
		int sp = sc.nextInt();
		
		String result = (cost<sp)?"We are in Rs."+ (sp-cost) +" profit!":"We are in Rs."+ (sp-cost) +" loss!";
		
		System.out.println(result);
	}

}