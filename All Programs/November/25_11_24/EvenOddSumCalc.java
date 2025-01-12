/*
Q1. Write a java program to calculate sum of even & odd  number of array.
*/

import java.util.*;
public class EvenOddSumCalc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,5,4,8,7,9,3,6,11};
		int evenSum=0,oddSum=0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				evenSum += arr[i];
			}else{
				oddSum += arr[i];
			}
		}
		
		//Displaying even and odd sum
		System.out.printf("Even Sum:%d \nOdd Sum:%d",evenSum,oddSum);
		
	}
}