/* WAP to print the Following Pattern.

    *
   **
  ***
 ****
*****

*/

public class ReverseInvertHalfTrianglePattern{
	public static void main(String args[]){
		int num=5;
		
		for(int i=1; i<=num; i++){
			int j=0;
			//For whiltspaces
			for(j=1; j<=(num-i); j++){
				System.out.print(" ");
			}
			//For *
			for(int k=j; k<=num; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}