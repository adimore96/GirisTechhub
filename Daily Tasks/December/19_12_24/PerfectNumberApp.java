class CheckPerfect {
    private int number; // Instance variable to store the input number

    // Method to accept the number as a parameter
    void setNum(int no) {
        this.number = no;
    }

    // Method to check if the number is a perfect number
    void checkPerfect() {
        int sum = 0;

        // Calculate the sum of divisors of the number
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }

        // Check if the sum of divisors equals the number
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}

public class PerfectNumberApp {
    public static void main(String[] args) {
        CheckPerfect perfectChecker = new CheckPerfect(); // Create an object of CheckPerfect

        // Test with a sample number
        perfectChecker.setNum(28); // Set the number
        perfectChecker.checkPerfect(); // Check and display if it is a perfect number

        // Test another number
        perfectChecker.setNum(12);
        perfectChecker.checkPerfect();
    }
}
