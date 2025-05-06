/*
Q15. Replace All Occurrences of a Character in String
•	Description: Replace all occurrences of a character in a string with another character.

•	Input: "hello", o -> x

•	Output: "hellx"
*/

public class ReplaceChar{
	public static void main(String args[]){
		String str = new String("hello");
		String str1 = "";
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == 'o'){
				str1 += 'x';
			}else{
				str1 += str.charAt(i);
			}
		}
		
		System.out.println(str +" \n"+ str1);
	}
}