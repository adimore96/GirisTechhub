import java.util.*;
public class VowelCheckIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Character is Vowel");
        }
        else {
            System.out.println("Character is Consonent, Digit or Other Symbol.");
        }
    }
}