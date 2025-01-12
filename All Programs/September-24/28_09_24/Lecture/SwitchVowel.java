//WAP to input cahracter from keyboard and check character is consonant or vowel.
import java.util.*;

public class SwitchVowel{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a Character (A - Z): ");
		char ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z'){
			ch = (char)((int)ch+32);
		}
		switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':{
				System.out.println("Character is Vowel");
				break;
			}
			default:{
				System.out.println("Character is Consonant of Digit or Special Symbol");
			}
		}
	}
}