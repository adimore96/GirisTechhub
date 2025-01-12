/*

10.Merge Two Integer Arrays
	Write a class to write a method to merge two integer arrays into a single array.
	Explanation: Practice combining arrays and managing their sizes.
 
 */
 

class MergeArray{
	int arr1[],arr2[];
	
	void getFirstArray(int ...arr1){
		this.arr1 = arr1;
	}
	void getSecondArray(int ...arr2){
		this.arr2 = arr2;
	}
	
	void display(int arr[]){
		for(int num : arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}
	void getMergedArray(){
		int length = arr1.length+arr2.length;
		int arr3[] = new int[length];
		for(int i=0; i<arr1.length; i++){
			arr3[i] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++){
			arr3[arr1.length+i] = arr2[i];
		}
		System.out.print("Array1: ");
		display(arr1);
		System.out.print("Array2: ");	
		display(arr2);
		System.out.print("Merged Array: ");
		display(arr3);
	}
	
}

public class MergeArrayVA{
	public static void main(String args[]){
		MergeArray ma = new MergeArray();
		ma.getFirstArray(10,20,30,40);
		ma.getSecondArray(40,50,60);
		ma.getMergedArray();
		
	}
}