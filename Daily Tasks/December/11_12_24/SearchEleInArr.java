/*
Q2. WAP to create function name as 
void search(int a[],int value): this function can search the value in array if value found show the message value found otherwise show the message value ot found
void search(char [],char ch): this function can search the character in array if found show the message found otherwise not found
*/

import java.util.*;

public class SearchEleInArr{

	static void search(int arr[], int key){
		boolean isFound = false;
		int i=0;
		for( ; i<arr.length; i++){
			if(arr[i]==key){
				isFound = true;
				break;
			}
		}
		
		if(isFound){
			System.out.println(key+" found at "+i+" index ");
		}else{
			System.out.println(key+" not found!");
		}
	}
	
	static void search(char arr[], char key){
		boolean isFound = false;
		int i=0;
		for(; i<arr.length; i++){
			if(arr[i]==key){
				isFound = true;
				break;
			}
		}
		
		if(isFound){
			System.out.println(key+" found at "+i+" index ");
		}else{
			System.out.println(key+" not found!");
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,40,50,60};
		char arrChar[] = {'a','e','i','o','u'};
		
		System.out.println("Enter the element to search: ");
		int key = sc.nextInt();
		search(arr,key);
		
		System.out.println("Enter the character to search: ");
		char ch = (sc.next()).charAt(0);
		search(arrChar, ch);
	}
}