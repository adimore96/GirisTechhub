/*

Q2. Write a java program to display following pattern :
 1 2 3 4 5
 10 9 8 7 6
 11 12 13 14 15
 20 19 18 17 16
 21 22 23 24 25
 
 */
 
 import java.util.*;
 public class MatrixPattern {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No. of rows: ");
        int rows = sc.nextInt(); // Number of rows
		System.out.print("Enter No. of cols: ");
        int cols = sc.nextInt(); // Number of columns
		
        int num = 1;  // Starting number

        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) { // For odd rows
                for (int j = 1; j <= cols; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            } else { // For even rows 
                int end = num + cols - 1;
                for (int j = end; j >= num; j--) {
                    System.out.print(j + " ");
                }
                num += cols; // Update the starting number for the next row
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}