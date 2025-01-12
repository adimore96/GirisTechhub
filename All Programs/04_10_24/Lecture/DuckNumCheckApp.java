//WAP to check wether the number is duck or not
//Duck means number cantains 0
import java.util.*;
public class DuckNumCheckApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a number: ");
		int num = sc.nextInt();
		int temp = num, rem;
		boolean isDuck=false;
		
		while(num>0){
			rem = num%10;
			if(rem==0){
				isDuck = true;
				break;
			}
			num /= 10;
		}
		if(isDuck){
			System.out.printf("%d is Duck Number",temp);
		}
		else{
			System.out.printf("%d is Not a Duck Number",temp);
		}
		
		
	}
}