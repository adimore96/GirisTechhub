/*
Q1. Write a menu-driven program in java using switch case.
	1.Addition
	2.Subtraction
	3.Multiplication
	4,Division
*/

import java.util.Scanner;
public class MenuDrivenOperation{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int ex = 1;
	while(ex<=1){
		System.out.print("\n\n\n\t1.Addition	\n\t2.Subtraction	\n\t3.Multiplication	\n\t4.Division \n\t5.Exit \n\tEnter Choice:");
		int ch = sc.nextInt();
		if(ch == 5){
				System.out.print("Thank you!");
				ex++;
				break;
			}
		System.out.print("Enter Firts number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second number: ");
		int num2 = sc.nextInt();
		
		switch(ch){
			case 1:{
				System.out.print("Addition is: "+(num1+num2));
				break;
			}
			case 2:{
				System.out.print("Substraction is: "+(num1-num2));
				break;
			}
			case 3:{
				System.out.print("Multiplication is: "+(num1*num2));
				break;
			}
			case 4:{
				System.out.print("Division is: "+(num1/num2));
				break;
			}
			default :{
				System.out.print("Please enter a valid choice");
				break;
			}
		}
	}
	}
}