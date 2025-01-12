/*

 Q1. Write a java program display following pattern :
1
2 # 2
3 # 3 # 3
4 # 4 # 4 # 4
5 # 5 # 5 # 5 # 5

*/

import java.util.*;
public class PatternDisplay {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Rows: ");
        int n = sc.nextInt(); // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                // Print number
                System.out.print(i);
                // Print '#'
                if (j < i) {
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
    }
}
