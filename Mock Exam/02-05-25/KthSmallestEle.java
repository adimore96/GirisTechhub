/*
Q17. Find the Kth Smallest Element in an Array
•	Description: Find the kth smallest element in an unsorted array.

•	Input: [12, 3, 5, 7, 19], k = 2

•	Output: 5
*/

public class KthSmallestEle{
	
	public static int[] sortArr(int arr[]){
		for(int i=0; i<arr.length-1;i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String args[]){
		int arr[] = {12,3,5,7,19};
		int k = 2;
		
		arr =  sortArr(arr);
		
		int count = 0;
		for(int i=0; i<arr.length-1; i++){
			if(arr[i] != arr[i+1]){
				count++;
			}
			
			if(count == k){
				System.out.println(arr[i]);
				break;
			}
		}
	}
}