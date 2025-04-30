/*
16. Find the Largest Sum of Contiguous Subarray
Description: Find the largest sum of a contiguous subarray in a given array.

Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
*/

public class FindLargestSumContigenousSubArray{
    public static void main(String args[]){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        // find using bruteforce method: o(n^2)
        int  highestSum = arr[0];
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                // System.out.println("Sum "+sum);
                if(sum > highestSum){
                    highestSum = sum;
                }
            }
            
        }

        System.out.println(highestSum);

        // Now fing using Kadane's Algorithm: o(n)
        int sum = 0; 
        highestSum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(sum>highestSum){
                highestSum = sum;
            }

            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(highestSum);

    }
}