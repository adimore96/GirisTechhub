/*
17. Find Missing Number in Array
Description: Find the missing number in an array containing numbers from 1 to n.

Input: [1, 2, 4, 5]
Output: 3
*/

public class FindMissingEleInArr{
    public static void main(String args[]){
        int arr[] = {1,2,0,4,5};

        int n = arr.length;
        int sum = 0;
        for(int ele:arr){
            sum += ele;
        }
        System.out.println(((n*(n+1))/2)-sum); //this formula only works when
                //  [This formula is correct only if the array has numbers from 1 to n.]
        

        int arr1[] = {1,2,4,5};
        n = arr1.length;
        System.out.println((((n+1)*(n+2))/2)-sum); 
    }
}