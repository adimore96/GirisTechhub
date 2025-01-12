import java.util.Scanner;
public class GreaterNumberNestedIF{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter Third Number: ");
		int num3 = sc.nextInt();
		
		
		//Nesting condition check without && operation: 
		if(num1>num2 ){
			if(num1>num3){
				System.out.println(num1+" is greater");
			}
			else{
				System.out.println(num3+" is greater");
			}
		}else if(num2>num1){
			if(num2>num3){
				System.out.println(num2+" is greater");
			}
			else{
			System.out.println(num3+" is greater");
			}
		}
		
		
	}
}