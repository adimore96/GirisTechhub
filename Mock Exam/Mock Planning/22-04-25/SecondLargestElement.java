/*
8. Find the Second Largest Element in Array
Description: Find the second largest element in an array.
Input: [10, 20, 30, 40, 50]
Output: 40
*/

public class SecondLargestElement{
    public static void main(String args[]){
        int []arr = {10,20,30,90,40,30,50};

        // By using two variables 
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i]>secondLargest&&firstLargest>arr[i]){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);

        // By using Sorting technique
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(arr[1]);
    }
}