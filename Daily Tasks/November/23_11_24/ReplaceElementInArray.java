/*
4. Write a program to replace a particular element by a value
 */

 import java.util.Scanner;

 public class ReplaceElementInArray {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Define the array
         System.out.print("Enter the size of the array: ");
         int size = sc.nextInt();
         int[] arr = new int[size];
 
         // Input array elements
         System.out.println("Enter the elements of the array:");
         for (int i = 0; i < size; i++) {
             arr[i] = sc.nextInt();
         }
 
         // Input the element to replace
         System.out.print("Enter the element to replace: ");
         int oldValue = sc.nextInt();
 
         // Input the new value
         System.out.print("Enter the new value: ");
         int newValue = sc.nextInt();
 
         // Replace the element if it exists
         boolean isReplaced = false;
         for (int i = 0; i < size; i++) {
             if (arr[i] == oldValue) {
                 arr[i] = newValue;
                 isReplaced = true;
             }
         }
 
         // Print the updated array or a message if the element is not found
         if (isReplaced) {
             System.out.println("Array after replacement:");
             for (int i = 0; i < size; i++) {
                 System.out.print(arr[i] + " ");
             }
         } else {
             System.out.println("Element not found in the array!");
         }
 
         sc.close();
     }
 }
 