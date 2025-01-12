/*
4) WAP to insert the element on specified position in array ?
When we insert the value on index then we need to shift the values from index to next index.
*/

import java.util.*;

public class ShiftArrayEle{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2]=30;
		arr[3] = 40;
		
		System.out.print("Enter index: ");
		int index = sc.nextInt();
		System.out.print("Enter element: ");
		int element = sc.nextInt();
		
		
		//Shifting Logic
		for(int i=arr.length-1; i>index; i--){
			arr[i] = arr[i-1];
		}
		arr[index] = element;
		
		
		//Displaying
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

}