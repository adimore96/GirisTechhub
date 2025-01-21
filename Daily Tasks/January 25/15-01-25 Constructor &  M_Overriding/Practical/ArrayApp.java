/*
3. Find the Largest and Smallest Elements in an Array Using Constructors:
Problem:
Create a class ArrayOperations that accepts an array of integers in the constructor. Then:
Find the smallest and largest element in the array.
Print these values.
*/

class ArrayOperations{
    int arr[];
    ArrayOperations(int arr[]){
        this.arr = arr;
    }

    public void displaySmallLargeEle(){
        int smallestEle = arr[0],largestEle = arr[0];
        for(int i=1; i<arr.length; i++){
            if(smallestEle>arr[i]){
                smallestEle = arr[i];
            }
            else if(largestEle < arr[i]){
                largestEle = arr[i];
            }
        }
        System.out.printf("Smallest element is %d and Largest element is %d.",smallestEle,largestEle);
    }
}

public class ArrayApp{
    public static void main(String args[]){
        int arr[] = {10,20,30,40};
        ArrayOperations ao = new ArrayOperations(arr);
        ao.displaySmallLargeEle();
    }
}