//Temperature conversion from Fahrenheit to Celsius

public class TempratureConvetor{

	public static void main(String args[]){
		float fah = Float.parseFloat(args[0]);
		
		float cel = (fah - 32)*5/9;

		System.out.printf("%f in Fahrenheit to %f in Celsius", fah,cel);

	}
} 