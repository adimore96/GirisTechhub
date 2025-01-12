//Write a java program to check whether a character is uppercase or lowercase alphabet.

import java.util.*;

public class AlphabetCaseChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Alphabet: ");
		char ch = sc.next().charAt(0);
		
		if((ch>='A' && ch<='Z') ){
			System.out.println(ch+" is a Uppercase");
		}
		else if((ch>='a'&& ch<='z')){
			System.out.println(ch+" is a Lowercase.");
		}
		else{
			System.out.println(ch+" is not a Alphabet.");
		}
	}
}