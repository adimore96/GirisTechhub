//WAP to read the number and display cube and fourth power.

import java.util.*;
public class CubeAndFourthPowCalculator{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		double cube = Math.pow(num,3);
		double fourthPower = num*num*num*num;
		System.out.println("Cube is: "+ cube);
		System.out.println("Fourth power is: "+ fourthPower);
		

	}
}