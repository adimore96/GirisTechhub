/*

8.    Shift Array Elements to the Left
   Write a class to create a method to shift all elements in an array one position to the left.
 Explanation: Work with array indexes and element reassignment.

*/

class ShiftArray{
	int arr[];
	
	void display(){
		for(int i=0; i<arr.length-1; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	void getArrayValues(int ...arr){
		this.arr = arr;
	}
	void getShiftedArray(){
		for(int i=0; i<this.arr.length-1; i++){
			this.arr[i]=this.arr[i+1];
		}
		
		
	}
}

public class ShiftArrayEleVA{
	public static void main(String args[]){
		ShiftArray sa = new ShiftArray();
		sa.getArrayValues(10,20,30,40,50,60);
		System.out.print("Before shifting array: ");
		sa.display();
		sa.getShiftedArray();
		System.out.print("\nAfter shifting array: ");
		sa.display();
	}
}