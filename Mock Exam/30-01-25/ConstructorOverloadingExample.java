/*
Q6. Write a java program using constructor overloading with class name as ArrayCons.
ArrayCons (int a [],int value): this function is used for accept array as parameter and pass
value and search value in array.
ArrayCons(char a[]): this function will accept array as parameter and calculate sum of
digit in string.
 // Input : - giris123tech45hub67
 // Output : - 123+45+67 = 235
*/

import java.util.*;

class ArrayCons {
	
    // Constructor to search for a value in an integer array
    public ArrayCons(int a[], int value) {
        boolean found = false;
        for (int num : a) {
            if (num == value) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value " + value + " found in array.");
        } else {
            System.out.println("Value " + value + " not found in array.");
        }
    }

    // Constructor to calculate the sum of digits in a string
    public ArrayCons(char a[]) {
        String str = new String(a);
        int sum = 0;
        String temp = "";

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                if (!temp.isEmpty()) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if (!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }

        System.out.println("Sum of digits in string: " + sum);
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Integer array input
        System.out.print("Enter size of integer array: ");
        int size = sc.nextInt();
        int[] intArray = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < size; i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.print("Enter value to search: ");
        int value = sc.nextInt();
        new ArrayCons(intArray, value);
        
        // Character array input
        System.out.print("Enter a string containing digits: ");
        String inputString = sc.next();
        new ArrayCons(inputString.toCharArray());
        
        sc.close();
    }
}
