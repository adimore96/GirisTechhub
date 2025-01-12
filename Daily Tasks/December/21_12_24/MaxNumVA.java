/*

    Find the Maximum Value in an Array
o   Write a class with a method to find and return the maximum value in an integer array.
 Explanation: Learn how to traverse an array and find the largest element using methods.


*/

class MaxNum{

	int getMaxVal(int ...X){
		int max = X[0];
		
		for(int i=1; i<X.length; i++){
			if(X[i]>max)
				max = X[i];
		}
		return max;
	}
}

public class MaxNumVA{
	public static void main(String args[]){
		MaxNum mn = new MaxNum();
		int result = mn.getMaxVal(2,5,40,65,12,32,96,15,34);
		System.out.println("Max Value: "+result);
		
	}
}