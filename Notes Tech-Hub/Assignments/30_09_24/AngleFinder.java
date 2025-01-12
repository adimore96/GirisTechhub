//WAP to input two angles of triangle and find third angle.

import java.util.*;
public class AngleFinder{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First angle: ");
		int fa = sc.nextInt();
		System.out.print("Enter Second angle: ");
		int sa = sc.nextInt();
		
		int ta = 180 - (fa+sa);
		System.out.println("Third angle: "+ta);
	}
}