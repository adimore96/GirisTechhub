import java.util.Scanner;
public class SwitchProgram{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter \n1.for Additiion: \n2.For Substraction:\n\t");
		int ch = sc.nextInt();
		
		switch(ch){
			case 1:{
				System.out.print("Enter First Number: ");
				int num1 = sc.nextInt();
				System.out.print("Enter Second Number: ");
				int num2 = sc.nextInt();
				System.out.print("Addition is: "+(num1+num2));
				break;
			}
			case 2:{
				System.out.print("Enter First Number: ");
				int num1 = sc.nextInt();
				System.out.print("Enter Second Number: ");
				int num2 = sc.nextInt();
				System.out.print("Substraction is: "+(num1-num2));
				break;
			}
			default:{
				System.out.print("Enter valid choice: ");
			}
			
		}
		
		
	}
}