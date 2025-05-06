/*
Q5.Find the Frequency of an Element in Array
Description: Find how many times an element appears in an array.

Input: [1, 2, 2, 3, 4, 2, 5], element 2
*/

public class EleFrequency{
	public static void main(String args[]){
		int arr[] = {1, 2, 2, 3, 4, 2, 5};
		int ele = 2;
		int freq = 0;
		
		for(int e:arr){
			if(e==ele){
				freq++;
			}
		}
		
		System.out.printf("%d appers %d times in an array.",ele,freq);
	}
}