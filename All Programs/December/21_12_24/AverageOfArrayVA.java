/*

2.    Calculate the Average of an Array
  Write a class to create a method to calculate the average of elements in an integer array.
 Explanation: Practice basic arithmetic operations and array traversal.
 
 */
 

class AverageArray{
	int getAverage(int ...arr){
		int counter=0;
		int avg=0;
		for(int num:arr){
			avg += num;
			counter++;
		}
		
		return avg /= counter;
	}
}

public class AverageOfArrayVA{
	
	public static void main(String args[]){
		AverageArray aa = new AverageArray();
		int result = aa.getAverage(10,20,30,40,50,60);
		System.out.println("Averege is: "+result);
	}
	
}