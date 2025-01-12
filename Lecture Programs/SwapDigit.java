//WAP to input the four digit number and swap only first nd last digit.

import java.util.*;

public class SwapDigit{

	public static void main(String args[]){
/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Four digit number:" );
	
		int num = sc.nextInt();
		System.out.print("Original Number: "+num);

		int firstDigit = num/1000;	
		int lastDigit = num%10;
		int middleDigit = (num % 1000) / 10;  //{it modules with 1000 because it returns the last 3 digits(i.e 234) then divided by the 10 to get the first 2 digits (i.e 23).}

		int swappedDigit = lastDigit*1000 + middleDigit*10 + firstDigit;
		
		System.out.println("Swapped First nd Last Digit: "+swappedDigit);
	

//*******************************************Another Method to Swap first and last digit***********************************************

		System.out.print("Enter a Four digit number:" );
	
		num = sc.nextInt();
		System.out.print("Original Number: "+num);

		num = (num%10)*1000     +   ((num%1000)/10)*10  +  (num/1000);
		//    (1234%10)*1000    +   ((1234%1000)/10)*10 +  (1234/1000)
		//      4*1000          +      (234/10)  * 10   +  (1)
		//      4000            +      23  *  10        + 1
		//      4000            +      230              + 1
		//      4231
		System.out.print("Swapped First nd Last Digit: "+num);

*/
//*******************************************Another Method to Swap first and last digit***********************************************

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the 4 digit number: ");
	int num = sc.nextInt();
	System.out.println("Before swapping: "+num);
	int lastDigit = num%10;
	int firstDigit = num/1000;
	num = num/10; //1234/10 = 123
	
	num = num%100; //123%100 = 23 {modules by 100 because we want the last 2 digits}

	//System.out.println(num);
	
	int last = lastDigit*1000;
	num = num*10;
	
	num = last + num + firstDigit;

	System.out.println("3rd method to print Swap digit: "+num);


	}

}