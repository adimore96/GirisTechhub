//Write a java program to swap first and last digits of a number.
import java.util.*;
public class SwapFirstAndLastDigitApp{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Handling numbers with only one digit
        if (num < 10 && num > -10) {
            System.out.println("The number is a single digit, so swapping doesn't change it.");
            return;
        }

        int temp = num;
        int lastDigit = num % 10;  // Extract last digit
        int firstDigit = 0;
        int divisor = 1;

        // Find the first digit and divisor
		//1234
        while (temp >= 10 || temp <= -10) {
            temp /= 10;
            divisor *= 10;
        }
        firstDigit = temp;

        // Remove the first and last digits from the original number
        int middlePart = (num % divisor) / 10;

        // Create the new number by swapping first and last digits
        int swappedNumber = lastDigit * divisor + middlePart * 10 + firstDigit;

        // Output the swapped number
        System.out.println("The number after swapping first and last digits is: " + swappedNumber);
    }
}
		