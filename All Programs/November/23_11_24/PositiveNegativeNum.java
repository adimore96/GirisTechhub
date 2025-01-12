/*
Q.5 Write a java program to find positive and negative number from array.
*/

import java.util.*;

public class PositiveNegativeNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		//Taking input
		System.out.println("Enter any 5 Numbers: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		//Odd Index Numbers
		for(int i=0; i<arr.length; i++){
			if(arr[i]>0){
				System.out.println("Positive Number: "+arr[i]);
			}else if(arr[i]<0){
				System.out.println("Negative Number: "+arr[i]);
			}else{
				System.out.println("Zero Number: "+arr[i]);
			}
		}
		
	}
}