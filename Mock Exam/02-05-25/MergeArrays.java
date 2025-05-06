/*
Q8. Merge Two Arrays
Description: Merge two arrays into one.

Input: [1, 2, 3], [4, 5, 6]

Output: [1, 2, 3, 4, 5, 6]
*/

public class MergeArrays{
	public static void main(String args[]){
		int arr1[] = {1,2,3};
		int arr2[] = {4,5,6};
		
		int arr3[] = new int[arr1.length + arr2.length];
		
		int j=0;
		for(int i=0; i<arr1.length; i++, j++){
			arr3[j] = arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++, j++){
			arr3[j] = arr2[i];
		}
		
		//displaying
		for(int ele: arr3){
			System.out.print(ele+" ");
		}
	}
}