//Temperature conversion from Celsius to Fahrenheit

public class TempratureConvetorApp{

	public static void main(String args[]){
		float cel = Float.parseFloat(args[0]);
		
		float fah = (cel * 9/5)+32;

		System.out.printf("%f in Celsius to %f in Fahrenheit", cel,fah);

	}
} 