/*
Check whether a given character is a digit or a letter using the Character wrapper class methods.
*/

public class CharDigitOrLetterUsingWrapperMethods{

    public static void main(String args[]){
        Character ch = 65;
        if(Character.isDigit(ch)){
            System.out.println(ch+" is a Digit.");
        }
        else if(Character.isLetter(ch)){
            System.out.println(ch+" is a Letter.");
        }
        else if(Character.isWhitespace(ch)){
            System.out.println(ch+" is a Space.");
        }else{
            System.out.println(ch+" is a Special symbol.");
        }
        
    }

}