/*
7. Check Number Is Happy Number or Not.
	
	Example :
	A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced 
	by the sum of squares of its digit that is if we start with Happy Number and keep replacing it with digits 
	square sum, we reach 1. 

	Input: n = 19
	Output: True
	19 is Happy Number,
	1^2 + 9^2 = 82
	8^2 + 2^2 = 68
	6^2 + 8^2 = 100
	1^2 + 0^2 + 0^2 = 1
	As we reached to 1, 19 is a Happy Number.
*/
import java.util.*;
public class HappyNumCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int rem,temp=num,newNum=0;
		boolean isHappy=false;
		
		
		while(num>9){
			newNum = 0;
			while(num>0){
				rem = num%10;
				newNum += (int)Math.pow(rem,2);
				num /= 10;
			}
			System.out.println("New Number: "+newNum);

			if(newNum==1){
				isHappy = true;
				break;
			}
			num = newNum;
			
		}
		
		if(isHappy){
			System.out.printf("%d is a Happy Number",temp);
		}
		else{
			System.out.printf("%d is Not a Happy Number",temp);
		}
		
		/*
		//Another Veriation: Without Boolean isHappy
		while(num>9){
			newNum = 0;
			while(num>0){
				rem = num%10;
				newNum += (int)Math.pow(rem,2);
				num /= 10;
			}
			num = newNum;
			
		}
		
		if(num==1){
			System.out.printf("%d is a Happy Number",temp);
		}
		else{
			System.out.printf("%d is Not a Happy Number",temp);
		}
		*/
	}
}