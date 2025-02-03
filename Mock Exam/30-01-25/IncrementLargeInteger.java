/*
Q3.You are given a large integer represented as an integer array digits, where each
digits[i] is the ith digit of the integer. The digits are ordered from most significant to least
significant in left-to-right order. The large integer does not contain any leading 0's.
 Increment the large integer by one and return the resulting array of digits.
Example :
 Input: digits = [1,2,3] Output: [1,2,4]
 Explanation: The array represents the integer 123.
 Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*/

import java.util.Arrays;

public class IncrementLargeInteger {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // If the digit is less than 9, simply increment and return
                return digits;
            }
            digits[i] = 0; // If it's 9, make it 0 and continue
        }

        // If all digits were 9, we need an extra digit at the beginning (e.g., 999 -> 1000)
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(digits));
        int[] result = plusOne(digits);
        System.out.println("Output: " + Arrays.toString(result));

        // Example case with carry
        int[] digits2 = {9, 9, 9};
        System.out.println("\nInput: " + Arrays.toString(digits2));
        int[] result2 = plusOne(digits2);
        System.out.println("Output: " + Arrays.toString(result2));
    }
}
