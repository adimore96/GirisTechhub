//Check valid triangle or not

import java.util.*;

public class TriangleChecker{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter first angle: ");
		int fs = sc.nextInt();
		System.out.print("Enter second angle: ");
		int ss = sc.nextInt();
		System.out.print("Enter third angle: ");
		int ts = sc.nextInt();
		
		if(((fs+ss+ts)==180)&& fs>0 && ss>0 && ts>0){
			System.out.println("Triangle is valid!");
		}
		else{
			System.out.println("Triangle is not valid!");
		}
	}
}