/*

7.    Find the Second Largest Element in an Array
  Write a class to write a method to find the second largest element in an integer array.
 Explanation: Practice logic building and conditional checks.

*/


class SecendLargestEleInArr{
	void getSecondLarEle(int ...arr){
		
		
		int largest = arr[0];
		int secondLargeEle = arr[1];
		
		for(int i=2; i<arr.length; i++){
			if(arr[i]>largest){
				secondLargeEle = largest;
				largest = arr[i];
			}else if(arr[i]>secondLargeEle && arr[i] != largest){
				secondLargeEle = arr[i];
			}
		}
		
		System.out.printf("Second Largest Ele: %d",secondLargeEle);
	}
}

public class SecondLargestEleVA{
	public static void main(String args[]){
		
		SecendLargestEleInArr sl = new SecendLargestEleInArr();
		sl.getSecondLarEle(2,5,23,40,12,10,25);
		
	
	}
}