//WAP to accept num as a paraameter and print its table.

import java.util.*;
public class Table{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		
		tableDisplay(num1);
	}
	
	public static void tableDisplay(int num1){
		for(int i=1; i<=10; i++){
			System.out.printf("%d * %d : %d\n",num1,i,num1*i);
		}
	}
}