/*
3. Array Pair Sum
Description: Write a program to find all pairs in an array whose sum equals a given target.

Input: [1, 4, 5, 3, 2], target 6
Output: [(4, 2), (5, 1)]
*/

public class ArrayPairsSum{
    public static void main(String args[]){
        int arr[] = {1,4,5,3,2};
        int target = 6;

        System.out.print("[");
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    System.out.printf("(%d, %d) ",arr[i],arr[j]);
                }
            }
        }
        System.out.print("]");
    }
}