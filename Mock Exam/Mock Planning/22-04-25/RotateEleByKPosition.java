/*
15. Rotate Array by N Positions
Description: Rotate the array by n positions to the right.
Input: [1, 2, 3, 4, 5], n = 2
Output: [4, 5, 1, 2, 3]
*/

public class RotateEleByKPosition{
    public static int[] swapEle(int arr[], int start, int end){
        for(int i=start, j=end; i<j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }

    public static void display(int arr[]){
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};

        int k = 2;
        display(arr);
        k = k%arr.length;

        arr = swapEle(arr,0,arr.length-1);
        arr = swapEle(arr,0,k-1);
        arr = swapEle(arr,k,arr.length-1);

        display(arr);

    }
}