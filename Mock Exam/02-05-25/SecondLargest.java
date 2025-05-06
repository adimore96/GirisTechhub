/*
Q6. Find the Second Largest Element in Array
Description: Find the second largest element in an array.

Input: [10, 20, 30, 40, 50]

Output: 40
*/

public class SecondLargest{

	public static void main(String args[]){
		int arr[] = {10, 20, 30, 40, 50};
		int counter = 0;
		for(int i=arr.length-1; i>0; i--){
			if(arr[i]!=arr[i-1]){
				counter++;
			}
			
			if(counter == 2){
				System.out.println("Second Largest Ele: "+arr[i]);
				break;
			}
		}
	}
}