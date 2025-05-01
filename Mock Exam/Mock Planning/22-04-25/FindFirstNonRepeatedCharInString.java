/*
23. Find the First Non-Repeated Character in a String
Description: Find the first non-repeated character in a string.

Input: "swiss"
Output: w
*/

public class FindFirstNonRepeatedCharInString{
    public static void main(String args[]){
        String str = new String("swiss");
        char ch = ' ';
        for(int i=0; i<str.length(); i++){
            boolean isRepeated = false;
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    isRepeated = true;
                }
            }

            if(!isRepeated){
                ch = str.charAt(i);
                break;
            }
        }

        System.out.println(ch);
    }
}