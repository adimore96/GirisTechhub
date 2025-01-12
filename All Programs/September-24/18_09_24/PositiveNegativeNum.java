import java.util.*;

public class PositiveNegativeNum{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		if(num == 0){
			System.out.println("Number "+num+" is Neutral");
		}
		else if(num >0){
			System.out.println(num+" is Positive");
		}
		else{
			System.out.println(num+" is Negative");
		}

	}
}