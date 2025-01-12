import java.util.*;

public class BitwiseAndOperation{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter a Number: ");
		int num2 = sc.nextInt();
		
		System.out.println("After Bitwise AND Operation");
		int num3 = num1&num2;
		System.out.println(num3);
	}
}