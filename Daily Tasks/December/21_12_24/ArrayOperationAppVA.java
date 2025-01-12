/*

Q2. Write a java program to create class name as ArrayOperationApp using function name as :

	void sortArray(int ...a)
	{
		//  Sort Array Ascending and Descending Order.
	}
	
	void uniqueArray(int ...b)
	{
		//  find unique value from array.
	}

*/

class ArrayOperationApp{
	void display(int arr[]){
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}
	void sortArray(int ...arr){
		System.out.print("Original Array: ");
		display(arr);
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}	
			
		}
		System.out.print("Ascending Order: ");
		display(arr);
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]<arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.print("Descending Order: ");
		display(arr);
	}
	void uniqueArray(int ...arr)
	{
		boolean isUnique = true;
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(arr[i]==arr[j]&&i!=j){
					isUnique = false;
					break;
				}
			}
		}
		
		if(isUnique){
			System.out.println("Array is Unique");
		}else{
			System.out.println("Array is not Unique");
		}
	}
	
}

public class ArrayOperationAppVA{
	public static void main(String args[]){
		ArrayOperationApp ao = new ArrayOperationApp();
		ao.sortArray(10,20,30,40,50,40);
		ao.uniqueArray(10,20,30,40,50);
	}
}