//// check triangle id equilateral, isosceles, scalen

import java.util.*;
public class TriangleTypeChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first angle: ");
		int fs = sc.nextInt();
		System.out.print("Enter second angle: ");
		int ss = sc.nextInt();
		System.out.print("Enter third angle: ");
		int ts = sc.nextInt();
		
		if(fs==ss && ss==ts && fs==ts){
			System.out.println("It is a Equilateral Triangle");
		}
		else if(fs==ss || ss==ts || fs==ts){
			System.out.println("It is a Isosceles Triangle");
		}
		else{
			System.out.println("It is a Scalen Triangle");
		}
		
	}
}