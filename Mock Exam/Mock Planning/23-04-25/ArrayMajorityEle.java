/*
1. Find the Majority Element in an Array
Description: Write a program to find the element that appears more than n/2 times in the array. If no such element exists, return -1.


Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
Output: 4
*/

public class ArrayMajorityEle{
    public static void main(String args[]){
        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        boolean isVisited[] = new boolean[arr.length];
        boolean isFound = false;

        for(int i=0; i<arr.length; i++){
            int count = 1;
            if(!isVisited[i]){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i]==arr[j]){
                        count++;
                        isVisited[j] = true;
                    }
                }
            }

            if(count>arr.length/2){
                System.out.print(arr[i]+" ");
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("No elements are in majority :(");
        }
    }
}