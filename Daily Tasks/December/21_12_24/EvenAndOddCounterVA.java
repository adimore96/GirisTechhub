/*

3.    Count Even and Odd Numbers in an Array
   Write a class to implement a method to count how many numbers are even and odd in an integer array.
 Explanation: Learn conditional checks and iteration in arrays.

*/

class EvenOddCounter{
	int result[] = {0,0};
	int[] getEvenOddCounts(int ...arr){
		for(int num:arr){
			if(num%2==0)
				result[0] = (result[0])+1;
			else
				result[1] = result[1]+1;
		}
		
		return result;
	}
}

public class EvenAndOddCounterVA{
	public static void main(String args[]){
		EvenOddCounter eoc = new EvenOddCounter();
		
		int result[] = eoc.getEvenOddCounts(10,15,65,2,3,1,45,6,7,9,17);
		System.out.printf("Even Numbers are: %d and Odd Numbers are: %d",result[0],result[1]);
	}
}