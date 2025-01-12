/*
Q3. Write a menu-driven program to take a input from user and solve following oprations:

	1. find area of circle.
	2. find area of reactangle.
	3. find area of triangle.
	4. find area of circumference.
	5. calculate area of equilateral triangle.
*/

import java.util.*;
import java.lang.*;
public class MenuDriven_AreaOf_Circla_Rectangel_Triangle_Circumference_EquiletralTriangle{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\n1. find area of circle. \n2. find area of reactangle.\n3. find area of triangle.\n4. find area of circumference.\n5. calculate area of equilateral triangle.\nEnter Your choics: ");
		int ch = sc.nextInt();
		
		switch(ch){
			case 1:{ 
				System.out.print("Enter a Radius of Circle: ");
				int r = sc.nextInt();
				float area = (float)Math.PI * (float)(Math.pow(r,2));
				System.out.print("Area of circle is: " +area);
				break;
			}
			case 2:{ 
				System.out.print("Enter a Length: ");
				int len = sc.nextInt();
				System.out.print("Enter a Width: ");
				int wid = sc.nextInt();
				int area = len*wid;
				System.out.print("Area of reactangle is: " +area);
				break;
			}
			case 3:{ 
				System.out.print("Enter a Base: ");
				int base = sc.nextInt();
				System.out.print("Enter a Height: ");
				int height = sc.nextInt();
				int area = (1/5) * (base*height);
				System.out.print("Area of trianle is: "+ area);
				break;
			}
			case 4:{
				//PI*r*2
				System.out.print("Enter the Radius: ");
				int radius = sc.nextInt();
				double circumference = Math.PI * radius * 2;
				System.out.println("Circumference of circle is: "+circumference);
			}
			case 5:{
				System.out.print("Enter the side of a triangle");
				float side = sc.nextFloat();
				double area = (Math.sqrt(3)/4) * (Math.pow(side,2));
				System.out.println("Area of Equiletral Triangle is: "+area);
			}
			default :{
				System.out.print("Enter valid Choice:");
				break;
			}
		}
		
	}
}