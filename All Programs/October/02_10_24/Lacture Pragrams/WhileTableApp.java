//WAP to input a number and print its table.

import java.util.*;
public class WhileTableApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int i=1;
		while(i<=10){
			System.out.printf("%d * %d = %d\n",num,i,num*i);
			i++;
		}
	}
}