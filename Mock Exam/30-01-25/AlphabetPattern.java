/*
Q1. Write a java program to print this pattern.
 A B C D E
   A B C D
     A B C
   	   A B
         A
       A B
     A B C
   A B C D
 A B C D E
*/
public class AlphabetPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        char ch;
        
        // Upper part of the pattern
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            
            ch = 'A';
            for (int j = i; j < n; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        
        // Lower part of the pattern
        for (int i = n - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            
            ch = 'A';
            for (int j = i; j < n; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
