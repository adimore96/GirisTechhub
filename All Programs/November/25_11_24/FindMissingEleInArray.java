/*
Q4. Write a java program to find missing element in array.
*/

import java.util.*;
public class FindMissingEleInArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter elements: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		//Finding missing elememts.
		for(int i=0; i<arr.length-1; i++){
			if(arr[i]<arr[i+1]){
				for(int j=arr[i]+1; j<arr[i+1]; j++){
					System.out.println("Missing element: "+j);
				}
			}
		}
	}
}