//Notes Calculator

import java.util.*;
public class NotesCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		int amount = sc.nextInt();
		int n500=0, n200=0, n100=0, n50=0, n20=0, n10=0;
		
		if(amount>=500){
			n500 = amount/500;
			amount = amount%500;
			System.out.println("500 * "+n500);
		}
		if(amount>=200){
			n200 = amount/200;
			amount = amount%200;
			System.out.println("200 * "+n200);
		}
		if(amount>=100){
			n100 = amount/100;
			amount = amount%100;
			System.out.println("100 * "+n100);
		}
		if(amount>=50){
			n50 = amount/50;
			amount = amount%50;
			System.out.println("50 * "+n50);
		}
		if(amount>=20){
			n20 = amount/20;
			amount = amount%20;
			System.out.println("20 * "+n20);
		}
		if(amount>=10){
			n10 = amount/10;
			amount = amount%10;
			System.out.println("10 * "+n10);
		}
		
	}
}