/*
1) Write a program to sort the given array in descending array
*/

import java.util.*;
public class RevArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("Enter 5 elements: ");
		//Taking input
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		//Revresing an array
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]<arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		//Displaying
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}