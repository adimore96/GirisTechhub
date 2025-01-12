/*
Q 1. Write java program to sort array in ascending and descending order.
 */

public class SortArray{
    public static void main(String[] args) {
        
        int arr[] = {2,5,4,3,80,64,23,45,99,32,56,42,75,100,512,256};

        // Before Sorting
        System.out.print("Before Sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        // Ascending order
        for (int i = 0; i < arr.length; i++) {
            for(int j=i; j<arr.length; j++){
                
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        // After Ascending order Sorting
        System.out.print("\nAscending Order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


         // Descending order
         for (int i = 0; i < arr.length; i++) {
            for(int j=i; j<arr.length; j++){
                
                if(arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        // After Descending order Sorting
        System.out.print("\nDescending Order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}