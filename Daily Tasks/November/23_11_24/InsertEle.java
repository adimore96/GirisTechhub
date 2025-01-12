/*
 Write a program to insert a element at given index 
 */

import java.util.*;
public class InsertEle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 4 array elements: ");
        for(int i=0; i<arr.length-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Value & Index: ");
        int value = sc.nextInt();
        int index = sc.nextInt();

        for(int i=arr.length-1; i>index; i--){
            arr[i] = arr[i-1];
        }

        arr[index] = value;

        System.out.println("After Inserting array element: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
