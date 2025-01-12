/*
2. Write a program to check whether an array is palindrome or not
*/

import java.util.*;

public class ArrayPalindromeCheck{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		boolean isPalindrome = true;
		
		//Taking input
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int start = 0, end = arr.length-1;
		for(int i=0; i<=(arr.length)/2; i++){
			if(arr[start] == arr[end]){
				start++;
				end--;
			}else{
				isPalindrome = false;
				break;
			}
		}
		
		//Check here is Palindrome or not
		if(isPalindrome){
			System.out.println("Array is Palindrome");
		}else{
			System.out.println("Array is not Palindrome");
		}
	}

}