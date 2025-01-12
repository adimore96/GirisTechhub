/*
Q4. Write a program to swap first two digit & last two digit of a number.
*/

import java.util.*;
public class FirstLastNumSwap{
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check number should have atleast 4 digits
        if (number < 1000) {
            System.out.println("Please enter a number with at least 4 digits.");
            return;
        }

        int originalNumber = number;

        // Find the number of digits
        int digitCount = 0;
        int temp = number;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        // Extract the first two digits
        int firstTwo = number / (int) Math.pow(10, digitCount - 2);

        // Extract the last two digits
        int lastTwo = number % 100;

        // Remove first two digits and last two digits to get the middle part
        int middlePart = (number % (int) Math.pow(10, digitCount - 2)) / 100;


        //123456 => (6)  : 56*10000=> 560000 : 34*100=> 3400 : 12
        // Create the swapped number
        int swappedNumber = lastTwo * (int) Math.pow(10, digitCount - 2) + middlePart * 100 + firstTwo;

        // Output the swapped number
        System.out.println("Original number: " + originalNumber);
        System.out.println("Swapped number: " + swappedNumber);

        scanner.close();
	}
}