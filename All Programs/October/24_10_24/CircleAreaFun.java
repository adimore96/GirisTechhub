// WAP to create function name as float getArea(float) this function can accept radius as input and calculate its area and return it.

import java.util.*;
public class CircleAreaFun{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        float r = sc.nextInt();
        float area = getArea(r);
        System.out.println("Area of circle is: "+area);
    }

    public static float getArea(float r){
        float area = (float)(Math.PI * Math.pow(r, 2));
        return area;
    }
}