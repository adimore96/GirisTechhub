/*
Q3. Write a java program to create class name as ArrayOperation using contsructor overloading name as :

	ArrayOperation(int [ ])
	{
		//  Sort Array Ascending and Descending Order.
	}
	
	ArrayOperation(int a[ ] , int b[ ])
	{
		//  Merge Two Array and display it.
	}
*/

public class ArrayOperation{
    ArrayOperation(int[]arr){
        System.out.print("Original Array: ");
        displayArr(arr);

        //Sorting in Ascending order
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        displayArr(arr);

         //Sorting in Descending order
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        displayArr(arr);

    }

    ArrayOperation(int[] arr1, int[] arr2){
        //Merging two array
        int size = arr1.length + arr2.length;
        int arr3[] = new int[size];
        int i=0;
        for( ; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for( int j=0; j<arr2.length; i++, j++){
            arr3[i] = arr2[j];
        }

        System.out.print("\n\nFirst Array: ");
        displayArr(arr1);
        System.out.print("Second Array: ");
        displayArr(arr2);
        System.out.print("Merged Array: ");
        displayArr(arr3);
    }

    private void displayArr(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }



    public static void main(String args[]){
        int arr[] = {5,41,1,2,99,45,20,15,75,9,98,32};
        ArrayOperation ao = new ArrayOperation(arr);

        int arr1[] = {10,20,30};
        int arr2[] = {40,50,60};
        ao = new ArrayOperation(arr1,arr2);
    }
}