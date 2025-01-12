/* WAP to print the Following Pattern.

*****
*   *
*****

*/

public class HollowRectanglePattern{
	public static void main(String args[]){
		int num=5;
		for(int i=1; i<=(int)(Math.ceil((float)num/2)); i++){
			for(int j=1; j<=num; j++){
				if(j==1 || i==1 || j==num || i==(int)(Math.ceil((float)num/2))){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}