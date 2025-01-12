//Q.5 Write a Java program to calculate the sum of all elements from a given array.

import java.util.Scanner;

public class SumOfArrayEle {
	public static void main(String args[]) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("Enter the array elements");


		// Getting input using while loop
		
		for (int i=0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			i++;
		}

		// displaying output using
		for (int i=0; i < arr.length; i++) {
			sum += arr[i];
			i++;
		}
		System.out.println("Sum of all array elements is: " + sum);
	}

}