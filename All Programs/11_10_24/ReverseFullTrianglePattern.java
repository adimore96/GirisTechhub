/* WAP to print the Following Pattern.

********
 ******
  ****
   **
    *

*/

public class ReverseFullTrianglePattern{
	public static void main(String args[]){
		int num=8;
		
		for(int i=1; i<=num; i++){
			int j=0,k=0;
			//For whiltspaces
			for(j=1; j<=(i-1); j++){
				System.out.print(" ");
			}
			//For *
			for( k=j; k<=(num*2)-i; k++){
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}
}