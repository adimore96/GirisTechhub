/*
Q1.WAP to print following pattern?
   1
  121
 12321
1234321
*/

import java.util.*;
public class Pattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			
			for(int j=1; j<=num-i; j++){
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			
			for(int j=i-1; j>=1; j--){
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}