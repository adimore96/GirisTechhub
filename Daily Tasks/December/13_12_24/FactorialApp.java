
class Factorial {
    private int number; // Instance variable to store the number

    // Function to accept the number as a parameter
    void setNumber(int number) {
        this.number = number; // Assign the value to the instance variable
    }

    // Function to calculate and display the factorial of the number
    void showFactorial() {
        long factorial = 1; // Variable to store the factorial result
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Calculate factorial
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

public class FactorialApp {
    public static void main(String[] args) {
        Factorial fact = new Factorial(); // Create an object of the Factorial class
        fact.setNumber(5); // Set the number (e.g., 5)
        fact.showFactorial(); // Display the factorial of the number
    }
}
