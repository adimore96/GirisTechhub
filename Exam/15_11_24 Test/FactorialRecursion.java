/*

Q8. Write a program to calculate the factorial of a number using recursion.

*/

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Call the recursive function to calculate factorial
        long result = factorial(num);

        // Output the result
        System.out.println("Factorial of " + num + " is: " + result);

        scanner.close();
    }

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * factorial(n - 1); 
        }
    }
}
