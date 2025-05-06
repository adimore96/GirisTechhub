/*
Q11. . Find Missing Number in Array
Description: Find the missing number in an array containing numbers from 1 to n.

Input: [1, 2, 4, 5]

Output: 3
*/

public class MissingNum{
	public static void main(String args[]){
		int arr[] = {1,2,4,5};
		int n = arr.length;
		
		int totalSum = (n+1)*(n+2) / 2;
		
		//System.out.println(totalSum);
		
		int actualSum = 0;
		for(int ele: arr){
			actualSum += ele;
		}
		
		int missingNum = totalSum - actualSum;
		
		System.out.println("Missing Num: "+missingNum);
	}
}