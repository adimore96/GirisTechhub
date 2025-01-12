/*
 Write a program to delete element present at given index.
 */

import java.util.*;
public class DeleteEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        System.out.print("Given array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
        System.out.print("\nEnter index to delete an element: ");


        int index = sc.nextInt();

        for(int i=index; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        // After deleting an element at index
        System.out.println("After deleting element: ");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}