/*
Q3. Write a java program to display the reverse array.
*/


public class DisplayReverseArray{
	public static void main(String args[]){
		
		int arr[] = {10,20,30,40,50,60};
		
		System.out.print("Given array: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\nReversed array: ");
		for(int i=arr.length-1; i>=0; i--){
			System.out.print(arr[i]+" ");
		}
	}
}