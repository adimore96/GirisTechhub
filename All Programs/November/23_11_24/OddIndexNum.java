/*
Q.4 Write a java program to find odd index number from array.
*/

import java.util.*;

public class OddIndexNum{
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
			if(i%2!=0){
				System.out.println("Index: "+i+" Num: "+arr[i]);
			}
		}
		
	}
}