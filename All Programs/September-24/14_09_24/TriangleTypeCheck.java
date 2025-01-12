// check triangle is equilateral, isosceles or scalen.

import java.util.*;
public class TriangleTypeCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first side: ");
		int fs = sc.nextInt();
		System.out.print("Enter second side: ");
		int ss = sc.nextInt();
		System.out.print("Enter third side: ");
		int ts = sc.nextInt();
		
		String result = (fs==ss && ss==ts && fs==ts)? "Triangle is Equilateral": (fs==ss || ss==ts || fs==ts)?"Triangle is Isosceles":"Triangle is Scalen";
		
		System.out.println(result);
	}
}