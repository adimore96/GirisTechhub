/* WAP to print the Following Pattern.

*
*#
*#*
*#*#
*#*#*

*/

public class StarHashPattern{
	public static void main(String args[]){
		int num=8;
		
		for(int i=1; i<=num; i++){
			
			for(int j=1; j<=i; j++){
				if(j%2==0){
					System.out.print("*");
				}else{
					System.out.print("#");
				}
				
			}
			
			
			System.out.println();
		}
	}
}