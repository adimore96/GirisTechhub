/*
Q12. Check if a String is Palindrome
•	Description: Check if the given string is a palindrome.

•	Input: "madam"
•	Output: Palindrome
*/

public class StringPalindromeCheck{
	public static void main(String args[]){
		String str = new String("madam");
		boolean isPalindrome = true;
		
		for(int i=0, j=str.length()-1; i<str.length()/2; i++,j--){
			if(str.charAt(i) != str.charAt(j)){
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome){
			System.out.print(str+" is a Palindrome String");
		}else{
			System.out.print(str+" is not a Palindrome String");
		}
	}
}