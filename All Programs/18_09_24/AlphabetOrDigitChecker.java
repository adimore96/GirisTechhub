// Write a java program to input any  and check whether it is alphabet or digit.

import java.util.*;

public class AlphabetOrDigitChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter alphabet or digit");
		char ch = sc.next().charAt(0);
		
		if((ch>='A' && ch<='Z') || (ch>='a'&& ch<='z')){
			System.out.println(ch+" is a Alphabet");
		}
		else if(ch>='0' && ch<='9'){
			System.out.println(ch+" is a Digit.");
		}
		else{
			System.out.println(ch+" is an other symbol.");
		}
	}
}