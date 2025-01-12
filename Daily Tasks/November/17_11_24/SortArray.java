/*
3)WAP to enter the five element and display in ascending order ?
*/

import java.util.*;

public class SortArray{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter 5 Array elements");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		//Sorting
		for(int i=0; i<arr.length; i++){
			for(int k=i+1; k<arr.length; k++){
				if(arr[i]>arr[k]){
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			}
		}
		
		//Ascending Order:
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

}