/*
Q13. Count Words in a String
•	Description: Count the number of words in a string.
•	Input: "hello world"
•	Output: 2
*/

public class WordsCount{
	public static void main(String args[]){
		String str = new String("  hello   world   ");
		str = str.trim();
		int count = 1;
		
		for(int i=1; i<str.length(); i++){
			if(str.charAt(i)== ' ' && str.charAt(i-1) != ' '){
				count++;
			}
		}
		
		System.out.print(count);
	}
}