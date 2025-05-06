/*
Q2. Print the series:1, 11, 111, 1111,…………….?
*/
import java.util.*;
public class Series{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		System.out.print("Series: ");
		
		for(int i=1; i<=n; i++){
			sum = sum*10 + 1;
			System.out.print(sum+" ");
		}
	}
}