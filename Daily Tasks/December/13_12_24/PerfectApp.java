class Perfect {
    private int number; // Instance variable to store the number

    // Function to accept the number as a parameter
    void setValue(int number) {
        this.number = number; // Assign the value to the instance variable
    }

    // Function to check if the number is perfect and display the result
    void checkPerfect() {
        int sum = 0; // Variable to store the sum of divisors

        // Calculate the sum of all divisors (excluding the number itself)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the number is perfect
        if (sum == number) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is NOT a Perfect Number.");
        }
    }
}

public class PerfectApp {
    public static void main(String[] args) {
        Perfect perfect = new Perfect(); // Create an object of the Perfect class
        perfect.setValue(28);            // Set the number (e.g., 28)
        perfect.checkPerfect();          // Check if the number is perfect
    }
}
