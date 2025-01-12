//WAP to print ASCII value of given character.

import java.util.*;
public class ASCIIValue{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Character: ");
		char ch = (sc.next()).charAt(0);
		int asci = ch;
		System.out.println("ASCII code is: "+ asci);
	}
}