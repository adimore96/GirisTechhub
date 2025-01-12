// Q4.Write a java program check whether number is positive or negative.

import java.util.*;
public class PositiveNegative{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		String result = (num==0)?"Number is 0 not negative and not postitve! ":(num>0)? num + " is a postitve number!" : num+" is negative number!";
		
		System.out.println(result);
	}
}