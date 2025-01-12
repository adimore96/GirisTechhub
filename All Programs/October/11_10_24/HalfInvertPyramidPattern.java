/* WAP to print the Following Pattern.

*****
 ****
  ***
   **
    *

*/

public class HalfInvertPyramidPattern{
	public static void main(String args[]){
		int num=5;
		
		//First Approach
		/*
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num; j++){
				if(i>j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
		//Second Approach
		for(int i=1; i<=num; i++){
			int j=1;
			//Printing the whileSpaces
			for( j=1;j<i; j++){
				System.out.print(" ");
			}
			//Printing the *
			for(int k=j; k<=num; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}