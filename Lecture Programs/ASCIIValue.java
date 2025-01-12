//WAP to print ASCII value of given character.

import java.util.*;
public class ASCIIValue{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Character: ");
		float ch = sc.nextChar();
		int asci = Integer.parseInt(ch);
		System.out.println("ASCII code is: "+ asci);


	}
}