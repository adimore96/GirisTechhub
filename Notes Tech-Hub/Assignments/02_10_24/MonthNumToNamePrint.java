//Write a C program to input month number and print total number of days in month using switch...case.
import java.util.*;
public class MonthNumToNamePrint{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = sc.nextInt();
		System.out.print("Enter Number Between 1-12: ");
		int num = sc.nextInt();
		boolean isLeapYear = year%4==0&&year%100!=0 || year%400==0;
		
		
		switch(num){
			case 1:{
				System.out.println("Total number of days = 31");
				break;
			}
			case 2:{
				if(isLeapYear){
					System.out.println("Total number of days = 29");
				}else{
					System.out.println("Total number of days = 28");
				}
				break;
			}
			case 3:{
				System.out.println("Total number of days = 31");
				break;
			}
			case 4:{
				System.out.println("Total number of days = 30");
				break;
			}
			case 5:{
				System.out.println("Total number of days = 31");
				break;
			}
			case 6:{
				System.out.println("Total number of days = 30");
				break;
			}
			case 7:{
				System.out.println("Total number of days = 31");
				break;
			}
			case 8:{
				System.out.println("Total number of days = 31");
				break;
			}
			case 9:{
				System.out.println("Total number of days = 30");
				break;
			}
			case 10:{
				System.out.println("Total number of days = 31");
				break;
			}
			case 11:{
				System.out.println("Total number of days = 30");
				break;
			}
			case 12:{
				System.out.println("Total number of days = 31");
				break;
			}
			default:{
				System.out.println("Enter Valid Choice (1-12)");
			}
		}
	}
}