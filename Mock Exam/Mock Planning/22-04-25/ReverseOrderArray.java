/*
1. Reverse an Array
Description: Reverse the order of elements in an array.
Input: [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
*/

public class ReverseOrderArray{
    public static void display(int arr[]){
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] =  {1,2,3,4,5};
        display(arr);

        //reversing array
        for(int i=0, j=arr.length-1; i<arr.length/2; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        display(arr);
    }
}