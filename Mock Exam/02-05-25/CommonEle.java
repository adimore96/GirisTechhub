/*
Q7. Find the Common Elements in Two Arrays
Description: Find the common elements between two arrays.

Input: [1, 2, 3, 4], [3, 4, 5, 6]

Output: [3, 4]
*/

public class CommonEle{
	public static void main(String args[]){
		int arr1[] = {1,2,3,4};
		int arr2[] = {3,4,5,6};
		
		System.out.print("[");
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){
				if(arr1[i]==arr2[j]){
					System.out.print(arr1[i]+" ");
					arr2[j] = -1;
					break;
				}
			}
		}
		System.out.print("]");
	}
}