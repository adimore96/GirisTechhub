/*
Q1. WAP to create function name as 
void sort(int a[]): this function can accept integer type of array and sort it 
void sort(char[]): this function can accept character type of array and sort it
*/

public class SortArrayWithFun{
	
	static void sort(int arr[]){
		// Displaying
		System.out.print("Int array before Sorting: ");
		displayArr(arr);
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(arr[i]<arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		// Displaying
		System.out.print("Int array after Sorting: ");
		displayArr(arr);
	}
	
	static void displayArr(int arr[]){
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}
	
	static void sort(char arr[]){
		System.out.print("Char array before Sorting: ");
		displayArr(arr);
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(arr[i]<arr[j]){
					char temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.print("Char array after Sorting: ");
		displayArr(arr);
	}
	
	static void displayArr(char arr[]){
		for(char ch:arr){
			System.out.print(ch+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String args[]){
		int arr[] = {20,5,7,6,3,1,80,70,45,61,75,12};
		char arrChar[] = {'X','D','x','Z','B','A','j','z','T','a','J'};
		
		sort(arr);
		sort(arrChar);
		
	}
}