/*
WAP to find the k'th smallest element.
*/

import java.util.*;
public class KthSmallestEle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,2,50,3,4,2,3,45,9,3,45,56,10,5};
		
		//Sorting array
		for(int i=0; i<arr.length;i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		
		System.out.print("Enter K'th number to search: ");
		int k = sc.nextInt();
		int count=1;
		//Finding K'th Smallest element
		for(int i=0; i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				count++;
			}
			
			if(count==k){
				System.out.print(k+"'th smallest element is: "+arr[i+1]);
				break;
			}
		}
		
		
	}
}