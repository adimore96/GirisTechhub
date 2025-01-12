/* WAP to print the Following Pattern.

*
*
*
*
*****

*/

public class L_Pattern{
	public static void main(String args[]){
		int num=10;
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num; j++){
				if(j==1 || i==num){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}