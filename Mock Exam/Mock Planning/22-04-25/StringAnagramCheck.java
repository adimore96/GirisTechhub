/*
24. Check if Two Strings are Anagrams
Description: Check if two strings are anagrams of each other.

Input: "listen", "silent"
Output: Anagram
*/

public class StringAnagramCheck{

    public static String sortString(String str){

        char ch[] = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                if(ch[i] > ch[j]){
                    char temp = ch[j];
                    ch[j] = ch[i];
                    ch[i] = temp;
                }
            }
        }
        String result = new String(ch);
        return result;
    }
    public static void main(String args[]){
        String str1 = "listen";
        String str2 = "silentt";

        str1 = sortString(str1);
        str2 = sortString(str2);

        if(str1.length() != str2.length()){
            System.out.println("Length mismatch. not an Anagram..!");
            return;
        }

        boolean isAnagram = true;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("String is an Anagram..!!");
        }else{
            System.out.println("String is not an Anagram..!!");
        }
    }
}