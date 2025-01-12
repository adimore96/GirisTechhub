/*
WAP to find the K'th largest element in an array.
*/

import java.util.*;
public class KthLargestEle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter K'th number:");
		int k = sc.nextInt();
		
		//Given array
		System.out.print("Given array: ");
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
		//Sorting
		for(int i=0; i<size; i++){
			for(int j=i+1; j<size; j++){
				if(arr[i]<arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		//After sorting
		System.out.print("\nAfter sorting array: ");
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
		
		//Finding K'th largest element
		System.out.println("\nFinding "+k+"'th Largest element");
		int count=1;
		for(int i=0; i<size; i++){
			if(arr[i]!=arr[i+1])
				count++;
			
			if(count==k){
				System.out.print(k+"'th Largest element is: "+arr[i+1]);
				break;
			}
		}
		
	}
}