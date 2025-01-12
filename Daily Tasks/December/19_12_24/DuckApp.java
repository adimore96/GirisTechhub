class Duck {
    private int number; // Instance variable to store the input number

    // Method to accept the number as a parameter
    void setNumber(int no) {
        this.number = no;
    }

    // Method to check if the number is a Duck number
    void checkDuck() {
        int temp = number;

        // A Duck number cannot start with 0
        if (temp == 0) {
            System.out.println(number + " is not a Duck number.");
            return;
        }

        boolean hasZero = false;

        // Iterate through the digits of the number
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            if (digit == 0) {
                hasZero = true; // Check if there is a zero
            }
            temp /= 10; // Remove the last digit
        }

        if (hasZero) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }
    }
}

public class DuckApp {
    public static void main(String[] args) {
        Duck duck = new Duck(); // Create an object of the Duck class

        // Test with a sample number
        duck.setNumber(1023); // Set the number
        duck.checkDuck();     // Check and display if it is a Duck number

        // Test another number
        duck.setNumber(1234);
        duck.checkDuck();
    }
}
