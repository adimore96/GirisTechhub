
import java.util.*;
public class ArraySort{
	public static void main(String args[]){
		
		int arr[] = {10,2,4,1,6,8,12,3};
		//System.out.println(arr.length);
		
		//for (int i = 0; i < arr.length - 1; i++) {
		//	for (int j = 0; j < arr.length - 1 - i; j++) {
		//		if (arr[j] > arr[j + 1]) {
		//			// Swap arr[j] and arr[j + 1]
		//			int temp = arr[j];
		//			arr[j] = arr[j + 1];
		//			arr[j + 1] = temp;
		//		}
		//	}
		//}
		
		//Ascending array Sort
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//Descending array sort
		for(int i=arr.length-1;i>=0;i--){
			for(int j=i-1; j>=0;j--){
				if(arr[j]<arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int arr1[] = {5,2,8,1,7,20,15,3};
		int min = (arr1.length)/2;
		//System.out.println(arr1.length+" : "+min);
		
		//Ascending sort first half of array
		for(int i=0; i<min-1; i++){
			for(int j=i+1; j<min; j++){
				if(arr1[i]>arr1[j]){
					int temp = arr1[i];
					//System.out.println(temp);
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		
		//Descending sort second half of array
		for(int i=arr.length-1;i>=min;i--){
			for(int j=i-1;j>=min;j--){
				if(arr1[j]<arr1[i]){
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}

	// Displaying the array
	for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
	}

		
		
		
	}
}