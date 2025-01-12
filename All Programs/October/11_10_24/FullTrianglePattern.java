/* WAP to print the Following Pattern.

    *
   ***
  *****
 *******
*********

*/

public class FullTrianglePattern{
	public static void main(String args[]){
		int num=8;
		/*
		for(int i=1; i<=num; i++){
			int j=0,k=0;
			//For whiltspaces
			for(j=1; j<=(num-i); j++){
				System.out.print(" ");
			}
			//For *
			for( k=j; k<=num; k++){
				System.out.print("*");
			}
			
			for(int l=1; l<=(i-1); l++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		for(int i=1;i<=num;i++){
			int j=0,k=0;
			//For whiteSpaces
			for(j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			
			//for printing stars
			for(k=1; k<=(2*i)-1; k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}