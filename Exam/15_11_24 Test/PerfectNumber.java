/*

Q6. Write a java program to check whether number is perfect or not using function
recursion.
ex: 6 28 496 8128 
*/

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is perfect
        if (isPerfect(num, 1, 0)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

        scanner.close();
    }

    // Recursive function to check if a number is perfect
    public static boolean isPerfect(int num, int divisor, int sum) {
        if (divisor == num) { // Base case: all divisors checked
            return sum == num; // Check if sum of divisors equals the number
        }

        // Add divisor to sum if it divides the number
        if (num % divisor == 0) {
            sum += divisor;
        }

        // Recursive call to check the next divisor
        return isPerfect(num, divisor + 1, sum);
    }
}
