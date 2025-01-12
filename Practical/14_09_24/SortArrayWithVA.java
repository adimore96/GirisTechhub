/*
	Sort with array
*/


class SortArray{
	int arr[];
	void acceptValue(int ...X){
		arr = X;
	}
	
	void performSort(){
		System.out.println("Before sorting array: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		System.out.println("\n\nAfter sorting array: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}

public class SortArrayWithVA{
	public static void main(String args[]){
		SortArray sa = new SortArray();
		sa.acceptValue(20,30,40,5,6,78,9,1,3,45,35);
		sa.performSort();
	}
}