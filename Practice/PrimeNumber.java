import java.util.Scanner;
public class PrimeNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Ending Number: ");
		int num2 = sc.nextInt();
		
		for(int i=num1; i<=num2; i++){
			boolean flag = false;
			if(i<=1){
					flag = true;
					continue;
			}
			for(int j=2 ; j<=Math.sqrt(i); j++){
				if(i%j==0){
					flag = true;
					break;
				}
			}
			if(flag==false){
			System.out.println(i+" is a Prime Number");
			}
		}
		
		
	}
}