//Write a java program to print all alphabets from a to z.

import java.util.*;
public class AlphabetDisplayApp{
	public static void main(String args[]){
		char ch= 'a';
		while( (int)ch<=(int)'z'){
			System.out.print(ch+" ");
			ch++;
		}
	}
}