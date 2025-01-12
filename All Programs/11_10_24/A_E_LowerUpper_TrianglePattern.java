/* WAP to print the Following Pattern.

A
ab
ABC
abcd
ABCDE

*/

public class A_E_LowerUpper_TrianglePattern{
	public static void main(String args[]){
		int num=5;
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++){
				if(i%2==0){
					System.out.printf("%c",(char)(96+j));
				}else{
					System.out.printf("%c",(char)(64+j));
				}
			}
			System.out.println();
		}
	}
}