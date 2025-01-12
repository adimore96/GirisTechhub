/* WAP to print the Following Pattern.

*
**
* *
*  *
*   *
*    *
*******

*/
import java.util.Scanner;
public class HollowTrianglePattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=0; i<num; i++){
			
			for(int j=0;j<=i;j++){
				if(j==0 || j==i || i==num-1){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}