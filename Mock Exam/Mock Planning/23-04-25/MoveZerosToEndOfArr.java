/*
6. Move Zeros to End of Array
Description: Move all zero elements of an array to the end while maintaining the order of other elements.

Input: [0, 1, 2, 0, 3, 4]
Output: [1, 2, 3, 4, 0, 0]
*/

public class MoveZerosToEndOfArr{
    public static void main(String args[]){
        int arr[] = {0, 1, 2, 0, 3, 4};

        for(int i=0; i<arr.length-1; i++){
                for(int j=i+1; j<arr.length; j++){
                   if(arr[i]==0 && arr[j]!=0){
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break;
                   } 
                }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}