/*
5). Write a program to enter the 5 values in ascending order and store in array and find out the
missing element from array?
*/

import java.util.*;

public class MissingEleFind{
	
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter any 5 values in ascending order: ");
			int arr[] = new int[5];
			
			//Taking input
			for(int i=0; i<arr.length; i++){
				arr[i] = sc.nextInt();
			}
			
			//Checking missing values
			for(int i=0;i<arr.length-1; i++){
				if(arr[i]+1 != arr[i+1]){
					for(int j=(arr[i])+1; j<arr[i+1]; j++){
						System.out.print(j+" ");
					}
				}
			}
			
						
			
			
	}
}