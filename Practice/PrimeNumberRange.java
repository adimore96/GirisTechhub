//Display Prime number in given range

import java.util.*;
public class PrimeNumberRange{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Ending number: ");
		int num2 = sc.nextInt();
		
		for(int i=num1; i<=num2; i++){
			boolean flag = false;
			for(int j=2; j<i; j++){
				if(i%j==0){
					flag = false;
					break;
				}
				else{
					flag=true;	
				}
			}
			//System.out.println(flag);
			if(flag==true){
				System.out.println(i);
			}
		}
	}
	
}