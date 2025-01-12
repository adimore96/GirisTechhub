//Write a java program to print all odd number between 1 to 100.
import java.util.*;
public class OddNumberApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num=1;
		while(num<=100){
			if(num%2!=0){
				System.out.println(num);
			}
			num++;
		}
	}
}