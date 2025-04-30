/*
13. Sort Array in Ascending Order
Description: Sort the elements of the array in ascending order.
Input: [10, 2, 30, 4, 5]
Output: [2, 4, 5, 10, 30]
*/

public class SortArrayInAscending{
    public static void display(int arr[]){
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {10,2,30,4,5};
        display(arr);
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        display(arr);


    }
}