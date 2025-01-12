//WAP to find Diameter and circumference of circle

public class DiameterOfCircle{

	public static void main(String args[]){
		float radius = Float.parseFloat(args[0]);
		
		float diameter = 2*radius;
		double circumference = 2*3.14*radius;
		double area = 3.14*radius*radius;

		System.out.println("Diameter of circle: "+ diameter);
		System.out.println("Circumference of circle: "+ circumference);
		System.out.println("Circumference of circle: "+ circumference);
		System.out.println("Area of circle: "+ area);

	}
}