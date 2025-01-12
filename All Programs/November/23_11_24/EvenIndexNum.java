/*
Q.3 Write a java program to find even index number from array.
*/

import java.util.*;

public class EvenIndexNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		//Taking input
		System.out.println("Enter any 5 Numbers: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		//Even Index Numbers
		for(int i=0; i<arr.length; i++){
			if(i%2==0){
				System.out.println("Index: "+i+" Num: "+arr[i]);
			}
		}
		
	}
}