/*

9.    Check if an Array is Sorted
   Write a class to implement a method to check whether an integer array is sorted in ascending order.
 Explanation: Understand conditions and comparisons in loops.

*/

class CheckSortedArray{
	
	boolean isArraySorted(int ...arr){
		boolean status = true;
		for(int i=0; i<arr.length-1; i++){
			if(arr[i]>arr[i+1]){
				status = false;
				break;
			}
		}
		
		return status;
	}
	
}

public class CheckSortedArrayVA{
	public static void main(String args[]){
		CheckSortedArray cs = new CheckSortedArray();
		boolean result = cs.isArraySorted(10,20,30,40,50,60);
		if(result){
			System.out.printf("Array is in Ascending Order.");
		}
		else{
			System.out.print("Array is not in Ascending Order.");
		}
	}
}