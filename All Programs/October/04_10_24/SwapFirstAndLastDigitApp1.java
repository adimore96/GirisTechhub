//Write a java program to swap first and last digits of a number

import java.util.*;
public class SwapFirstAndLastDigitApp1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		int lastDigit = num%10, firstDigit=0,counter=1;
		//1234
		while(temp>=10){
			temp /=10; //1
			counter *= 10; //1000
		}
		
		firstDigit = temp;
		int middleDigit = (num%counter)/10; //Removing the First and Last Digit.
		
		int SwappedNum = (lastDigit*counter)+(middleDigit*10)+firstDigit;
		
		System.out.printf("After swapped first and last digit is: %d",SwappedNum);
		
		
	}
}
		