/*
WAP to find the ceiling in a sorted array?
Given a sorted array in ascending order and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
 Expected Output :
 The given array is : 1 3 4 7 8 9 9 10
 The ceiling of 5 is: 7
*/

import java.util.*;
public class CeilingNumFindArr{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		//Sorted Array
		int arr[] = {1,3,4,7,8,9,9,10};
		
		System.out.print("Enter Target element: ");
		int target = sc.nextInt();
		
		int ceiling = -1;
		for(int num : arr){
			if(num>=target){
				ceiling = num;
				break;
			}
		}
		
		//Given array
		System.out.print("Given array: ");
		for(int num : arr){
			System.out.print(num+" ");
		}
		//Checking and displaying
		if(ceiling!=-1){
			System.out.printf("\nThe ceiling of %d is: %d",target,ceiling);
		}else{
			System.out.printf("\nNo ceiling found for %d in the array",target);
		}		
		
	}
}