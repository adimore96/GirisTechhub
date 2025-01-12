//Write a java program to find power of a number.
import java.util.*;
public class PowerOfNumApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Base Number: ");
		int bNum = sc.nextInt();
		System.out.print("Enter a Power: ");
		int pow = sc.nextInt();
		System.out.printf("%.2f is the power of %d",Math.pow(bNum,pow),bNum);
		System.out.printf("\nUsing While Loop: ");
		int res = 1;
		while(pow>0){
			res *= bNum;
			pow--;
		}	
		System.out.printf("\n%d is the power",res);		
		
	}
}