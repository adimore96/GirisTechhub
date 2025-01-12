/*
1. Write a program to take a 5 element array from user and display array in reverse
*/

import java.util.*;

public class ReverseArrayEle{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		//Take input
		System.out.println("Enter 5 elements: ");
		for(int i=0; i<5; i++){
			arr[i] = sc.nextInt();
		}
		
		//Displaying in reverse order
		System.out.println("Array in reverse order:");
		for(int i = arr.length-1; i>=0; i--){
			System.out.print(arr[i]+" ");
		}
		
		
	}

}