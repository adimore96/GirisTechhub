/*
Q3. Write a program to display Fibonacci series upto nth number.
	0 1 2 3 5 8 13 ....
*/


import java.util.*;
public class FibonacciSeries{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		// Getting input from the user 
		System.out.print("Enter No. of terms: ");
		int n = sc.nextInt();
		
		if(n<=0){
			System.out.println("Number should be greater than 0");
		}else{
			//Main logic
			int first = 0, second = 1;
			System.out.print("Fibonacci Series: ");
			for(int i=1; i<=n; i++){
				System.out.print(first +" ");
				
				int next = first + second;
				first = second;
				second = next;
			}
		}
	}
}