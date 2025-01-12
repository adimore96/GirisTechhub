/*
Q2. Write a java program to search element in array , its element found or not.
*/

import java.util.*;
public class SearchEle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10,20,16,15,30,40,50};
		System.out.print("Enter element to be found: ");
		int element = sc.nextInt();
		
		boolean isFound = false;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==element){
				isFound = true;
				break;
			}
		}
		
		//Displaying
		if(isFound){
			System.out.print(element+" is found in an array");
		}else{
			System.out.print(element+" is not found in an array");
		}
	}
}