/*
22. Count Words in a String
Description: Count the number of words in a string.

Input: "hello world"
Output: 2
*/

public class CountNoOfWordsInString{
    public static void main(String args[]){
        String str = new String("hello  word");
        int count = 1;

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)==' '&& str.charAt(i+1)!=' '){
                count++;
            }
        }

        System.out.println(count);
    }
}