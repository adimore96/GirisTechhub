import java.util.Scanner;

class CountDigit {
    private int number; // Instance variable to store the input number

    // Function to accept the number from the keyboard
    void setValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        this.number = sc.nextInt(); // Read and assign the number
    }

    // Function to count the digits and display the count
    void showDigitCount() {
        int temp = number;
        int count = 0;

        // Handle the case for number 0
        if (temp == 0) {
            count = 1;
        } else {
            // Loop to count the digits
            while (temp != 0) {
                temp /= 10; // Remove the last digit
                count++;    // Increment the count
            }
        }

        // Display the digit count
        System.out.println("The number " + number + " has " + count + " digits.");
    }
}

public class CountDigitApp {
    public static void main(String[] args) {
        CountDigit countDigit = new CountDigit(); // Create an object of the CountDigit class
        countDigit.setValue();                   // Accept the number from the user
        countDigit.showDigitCount();             // Count and display the number of digits
    }
}
