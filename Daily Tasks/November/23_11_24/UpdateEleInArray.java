/*
 3. Write a program to update a number by new number at given index
 */

import java.util.*;
public class UpdateEleInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};

        System.out.print("Given array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("\nEnter index and element to be Update: ");
        int index = sc.nextInt();
        int element = sc.nextInt();

        if(index<0 && index>=arr.length){
            System.out.println("Enter valid index B/W (0 to "+(arr.length-1)+")");
            return;
        }

        arr[index] = element;

        // Updated element:
        System.out.print("After updating an array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
