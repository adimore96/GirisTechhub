/*

6.    Sort an Array (Bubble Sort)
   Write a class to implement a method to sort an integer array using bubble sort.
 Explanation: Learn basic sorting algorithms and their implementation.
 
*/

class BubbleSort{
	int arr[];
	
	void display(){
		for(int num:arr){
			System.out.print(num+" ");
		}
	}
	void getArray(int ...arr){
		this.arr = arr;
	}
	void getBubbleSort(){
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}

public class BubbleSortWithVA{
	public static void main(String args[]){
		
		BubbleSort bs = new BubbleSort();
		bs.getArray(5,6,8,10,6,75,32,45,2,10,7,63,61);
		bs.display();
		System.out.println();
		bs.getBubbleSort();
		bs.display();
	
	}
}