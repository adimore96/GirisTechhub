/*
Q10. Find the Duplicate Elements in Array
Description: Find all the duplicate elements in an array.

Input: [1, 2, 3, 4, 5, 1, 3]
Output: [1, 3]
*/

public class DuplicateEle{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,1,3};
		
		for(int i=0; i<arr.length-1; i++){
			boolean isDuplicateFound = false;
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] == arr[j] && arr[i]!= -1){
					isDuplicateFound = true;
					arr[j] = -1;
				}
			}
			if(isDuplicateFound){
				System.out.print(arr[i]+" ");
			}
		}
	}
}