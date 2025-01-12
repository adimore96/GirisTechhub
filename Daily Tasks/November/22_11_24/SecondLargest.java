/*
3. Write a program to find the 2nd largest element from the given array without sorting technique
*/


import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible value
        int secondLargest = Integer.MIN_VALUE; // Initialize 2nd largest to the smallest possible value

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = arr[i]; // Update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i]; // Update second largest if the current element is smaller than largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements might be the same).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
