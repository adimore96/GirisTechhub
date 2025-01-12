//WAP to enter 2 angles and find 3rd angle

public class AngelFinder{
	
	public static void main(String args[]){
	
		float firstAngle = Float.parseFloat(args[0]);
		float secondAngle = Float.parseFloat(args[1]);

		float thirdAngle = 180 - (firstAngle+secondAngle);

		System.out.printf("First angle: %f\n Second angle: %f\n Third angle: %f", firstAngle,secondAngle,thirdAngle );

	}
}