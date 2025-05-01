/*
19. Reverse a String
Description: Reverse the given string.

Input: "hello"
Output: "olleh"
*/

public class ReverseString{
    public static void main(String args[]){
        String str = new String("hello");
        char ch[] = new char[str.length()];
        String str3 = "";
        for(int i=0, j=str.length()-1; i<str.length(); i++,j--){
            ch[i] = str.charAt(j);
            str3 += str.charAt(j);
        }

        String str1 = new String(ch);

        System.out.println(str1);
        System.out.println(str3);
    }
}