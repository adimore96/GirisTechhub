/*
Q20. Remove Vowels from a String
          Description: Remove all vowels from a given string.
          Input: "hello"
         Output: "hll"
*/

public class RemoveVowels{
	public static void main(String args[]){
		String str = new String("hello");
		str = str.toLowerCase();
		String str1 = "";
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u'){
				str1 += str.charAt(i);
			}
		}
		
		System.out.print(str1);
	}
}