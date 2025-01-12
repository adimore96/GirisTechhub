class CheckArmstrong {
    private int number; // Instance variable to store the input number

    // Method to accept the number as a parameter
    void setValue(int value) {
        this.number = value;
    }

    // Method to check if the number is an Armstrong number
    void checkArmstrong() {
        int temp = number;
        int sum = 0;
        int digits = 0;

        // Calculate the number of digits in the number
        int n = temp;
        while (n > 0) {
            digits++;
            n /= 10;
        }

        // Calculate the sum of the digits raised to the power of 'digits'
        n = temp;
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            sum += Math.pow(digit, digits); // Add the power of the digit to the sum
            n /= 10; // Remove the last digit
        }

        // Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

public class ArmstrongApp {
    public static void main(String[] args) {
        CheckArmstrong armstrong = new CheckArmstrong(); // Create an object of CheckArmstrong

        // Test with a sample number
        armstrong.setValue(153); // Set the number
        armstrong.checkArmstrong(); // Check and display if it is an Armstrong number

        // Test another number
        armstrong.setValue(123);
        armstrong.checkArmstrong();
    }
}
