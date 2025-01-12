/*
Q.2 Write a java program to find minimum number from array.
*/

import java.util.*;

public class MinNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		
		//Taking input
		System.out.println("Enter any 5 Numbers: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		
		//Finding min Number
		for(int i=0; i<arr.length; i++){
			if(min>arr[i]){
				min = arr[i];
			}
		}
		
		//Displaying max Number
		System.out.print("Min number in array: "+min);
		
	}
}