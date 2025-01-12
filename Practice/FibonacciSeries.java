import java.util.Scanner;
public class FibonacciSeries{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to series end with: ");
		int num = sc.nextInt();
		int n1=0,n2=1,n3;
		
		System.out.print(n1);
		for(int i=2; i<=num; i++){
			n3 = n1+n2;
			System.out.print(" "+n2);
			n1 = n2;
			n2 = n3;
		}
		
		
	}
}