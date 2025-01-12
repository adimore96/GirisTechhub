//Write a java program to print multiplication table of any number.
import java.util.*;
public class MultiplicationTableApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int i=1;
		while(i<=10){
			System.out.printf("%d * %d = %d\n",num,i,(num*i));
			i++;
		}
	}
}