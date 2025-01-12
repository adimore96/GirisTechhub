/*
Q5. Write a java program to copy one array to another array.
*/

import java.util.*;
public class CopyArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of an array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements:");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		
		int arrCopy[] = new int[arr.length];
		
		//Copying array elements
		for(int i=0; i<arr.length; i++){
			arrCopy[i] = arr[i];
		}
		
		//Displaying
		System.out.print("Original Array: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("\nCopied Array: ");
		for(int i=0; i<arrCopy.length; i++){
			System.out.print(arrCopy[i]+" ");
		}
	}
}