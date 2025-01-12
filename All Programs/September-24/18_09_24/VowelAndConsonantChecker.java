// Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.*;

public class VowelAndConsonantChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet");
		char ch = sc.next().charAt(0);
		
		if(ch=='A' || ch=='E' || ch=='I' ||ch =='O' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch== 'u'){
			System.out.println(ch+" is an alphabet is Vowel!");
		}
		else{
			System.out.println(ch+" is a Consonant!");
		}
	}
}