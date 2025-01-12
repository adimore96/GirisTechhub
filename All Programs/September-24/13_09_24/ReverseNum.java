//WAP to reverse the number.

import java.util.*;
public class ReverseNum{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		System.out.println("Original number: "+num);
		int rem;
		int rev = 0;
		//num=123
		while(num>0){

			rem = num%10; //3  2  1
			rev = rev * 10 +rem;
			//    0 * 10 + 3 = 3
			//    3 * 10 + 2 = 32
			//    32 * 10 + 1 = {321}
			num /= 10; //12 1 
		}

		System.out.println("Reverse of number: "+rev);
	}
}