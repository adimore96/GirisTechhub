/*
Q2. Write a menu-driven program in java using switch case.
	
	1.Check Number is positive , negative or zero. 
	2.Check Number is even or odd.
	3.Write a c program find max number using 2 number.
*/

import java.util.*;
public class MenuDriven_EvenOdd_PosNeg_MaxNum{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("1.Check Number is positive , negative or zero. \n2.Check Number is even or odd. \n3.Write a c program find max number using 2 number.\nEnter Your choics: ");
		int ch = sc.nextInt();
		
		switch(ch){
			case 1:{ 
				System.out.print("Enter a Number: ");
				int num = sc.nextInt();
				if(num==0)
					System.out.print(num+" is Neutral Number");
				else if(num>0)
					System.out.print(num+" is Positive Number");
				else
					System.out.print(num+" is Negative Number");
				break;
			}
			case 2:{ 
				System.out.print("Enter a Number: ");
				int num = sc.nextInt();
				if(num%2==0)
					System.out.print(num+" is Even number");
				else
					System.out.print(num+" is Odd number");
				break;
			}
			case 3:{ 
					System.out.print("Enter First Number: ");
					int num1 = sc.nextInt();
					System.out.print("Enter Second Number: ");
					int num2 = sc.nextInt();
					
					if(num1==num2)
						System.out.print("Both numbers are equal");
					else if(num1>num2)
						System.out.print(num1+" is greater than "+num2);
					else
						System.out.print(num2+" is greater than "+num1);
				break;
			}
			default :{
				System.out.print("Enter valid Choice:");
				break;
			}
		}
		
	}
}