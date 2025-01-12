//WAP to input the three digit number and reverse it.

import java.util.*;

public class ReverseNumber{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Three digit number:" );
	
		int num = sc.nextInt();

		int rem;
		String rev="";
	
		while(num>0){
			rem = num%10;
			rev += rem;
			num /= 10;
		}

		System.out.print("Revrse Number: "+rev);

//****************************************Another method to reverse the 3 digit method*************************************************
		System.out.println("\n\n\tAnother method to reverse 3 Digit Number");
		
		System.out.print("Enter the three digit number: ");
		int revNum=0;
		num = sc.nextInt();
		rem = num%10;
		num = num/10;
		revNum = revNum+rem*100;

		rem = num%10;
		num = num/10;
		revNum = revNum+rem*10;

		rem = num%10;
		num = num/10;
		revNum = revNum+rem;
 		
		System.out.print("Revrse Number: "+revNum);

//****************************************Another method to reverse the 3 digit method*************************************************
		System.out.println("\n\n\tAnother method to reverse 3 Digit Number");
		
		System.out.print("Enter the three digit number: ");
		num = sc.nextInt();
		
		num = (num%10)*100 + ((num/10)%10)*10  +  (num/100);
		System.out.print("Revrse Number: "+num);
	
		
	}

}