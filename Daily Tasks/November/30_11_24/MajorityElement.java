import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        // Input: Sorted array and the value to check
        int[] arr = {1, 3, 3, 3, 3, 3, 4, 5, 6};
        int x = 3;

        // Display the given array
        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.println("The given value is: " + x);

        // Check if x appears more than n/2 times
        int n = arr.length;
        int count = 0;

        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println(x + " appears more than " + (n / 2) + " times in the given array.");
        } else {
            System.out.println(x + " does not appear more than " + (n / 2) + " times in the given array.");
        }
    }
}