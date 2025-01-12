import java.util.Scanner;

class Reverse {
    private int number; // Instance variable to store the input number

    // Function to accept the number from the keyboard
    void setNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        this.number = sc.nextInt(); // Read and assign the number
    }

    // Function to reverse the number and display it
    void reverseNumber() {
        int reversed = 0, temp = number;

        // Loop to reverse the number
        while (temp != 0) {
            int digit = temp % 10;      // Extract the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            temp /= 10;                // Remove the last digit
        }

        // Display the reversed number
        System.out.println("The reverse of " + number + " is " + reversed);
    }
}

public class ReverseApp {
    public static void main(String[] args) {
        Reverse reverse = new Reverse(); // Create an object of the Reverse class
        reverse.setNumber();             // Accept the number from the user
        reverse.reverseNumber();         // Reverse and display the number
    }
}
