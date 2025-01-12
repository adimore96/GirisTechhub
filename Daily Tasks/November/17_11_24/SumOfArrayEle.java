/*
2) WAP to enter the five elements in array and calculate the sum of all elements
*/

import java.util.*;

public class SumOfArrayEle{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter 5 Array elements");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		//Summing the array elements
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		System.out.println("Sum of all array elements: "+sum);
	}

}