/* WAP to print the Following Pattern.

  *
  *
*****
  *
  *

*/
import java.util.Scanner;
public class PlusPattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0){
			System.out.print("Enter the Odd number :)");
			return;
		}
		
		int mid = num/2;
		for(int i=0; i<num; i++){
			
			if(i==mid){
				for(int k=0;k<num;k++){
					System.out.print("*");
				}
				System.out.println();
			}
			else{
			
				for(int j=0; j<num; j++){
					if(j==mid){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			
			
		}
	}
}