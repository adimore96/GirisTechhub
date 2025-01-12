/*
2) Write a program to find the largest elements from the given array.
*/
import java.util.*;

public class MinMaxElement{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter 5 Array elements");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int min = arr[0], max = arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(min>arr[i]){
				min = arr[i];
			}
			if(max<arr[i]){
				max = arr[i];
			}
		}
		
		System.out.println("Min ele: "+min+" Max ele: "+max);
		
	}

}