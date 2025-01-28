import java.util.Scanner;

public class XORSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers to swap
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using XOR
        a = a ^ b; // Step 1: a now holds the XOR of a and b
        b = a ^ b; // Step 2: b is set to original value of a
        a = a ^ b; // Step 3: a is set to original value of b

        System.out.println("After swapping: a = " + a + ", b = " + b);
        scanner.close();
    }
}
