//Write a java program to find all factors of a number.
import java.util.*;
public class FactorsOfNumApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		int half = num/2,i=1,j=1;
		
		while(i<=half){
				if(num%i==0){
					int factPair = num/i;
					System.out.printf("%d * %d = %d\n",i,factPair,num);
				}
			i++;
		}
		
	}
}