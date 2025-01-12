/*

4.    Reverse an Array
   Write a class to write a method to reverse the elements of an integer array.
 Explanation: Work with array indexing and swapping.
 
*/

class ReverseArray{
	
	void display(int arr[]){
		for(int num:arr){
			System.out.print(num+" ");
		}
	}
	
	void getReversedArray(int ...arr){
		System.out.print("Before Swapping array ele: ");
		display(arr);
		for(int i=0, j=arr.length-1; i<arr.length/2 ; i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.print("\nAfter Swapping array ele: ");
		display(arr);
	}
}

public class ReverseArrayWithVA{
	public static void main(String args[]){
		ReverseArray ra = new ReverseArray();
		ra.getReversedArray(10,20,30,40,50,50,60);
	}
}