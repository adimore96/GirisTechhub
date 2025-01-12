/*
Q.1 Write a java program to find maximum number from array.
*/

import java.util.*;

public class MaxNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		
		//Taking input
		System.out.println("Enter any 5 Numbers: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		
		//Finding max Number
		for(int i=1; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		
		//Displaying max Number
		System.out.print("Max number in array: "+max);
		
	}
}