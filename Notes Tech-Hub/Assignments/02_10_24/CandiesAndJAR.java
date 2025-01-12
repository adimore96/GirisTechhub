/*
Max Cap = N
At any time jar contains (M)Candies = M<=N
JAR is never remain empty as when last k candies are left.
Input should be the number of candies one customer can order at point of time.
Output should give number of Candies sold and updated number of Candies in JAR.
If Input is more than candies in JAR, return: "INVALID INPUT"
*/

import java.util.*;
public class CandiesAndJAR{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Candies: ");
		int M = sc.nextInt();
		int N = 10,K=5;
		if(M>N){
			System.out.println("INVALID INPUT");
		}else{
			if(M==0){
				System.out.println("INVALID INPUT");
				System.out.println("NUMBER OF CANDIES LEFT :"+N);
			}
			else{
				if((N-M)<=K){
					System.out.println("INVALID INPUT");
				}
				else{
					System.out.println("NUMBER OF CANDIES SOLD : "+M);
				System.out.println("NUMBER OF CANDIES LEFT :"+(N-M));
				}
			}
		}
	}
}