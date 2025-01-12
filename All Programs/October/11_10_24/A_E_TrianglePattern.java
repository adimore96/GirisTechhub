/* WAP to print the Following Pattern.

A
AB
ABC
ABCD
ABCDE

*/

public class A_E_TrianglePattern{
	public static void main(String args[]){
		
		//First Approach
		System.out.println("\nFirst Approach");
		for(int i='A'; i<='E'; i++){
			for(int j='A'; j<=i; j++){
				System.out.printf("%c",(char)j);
			}
			System.out.println();
		}
		
		//Second Approach
		System.out.println("\nSecond Approach");
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.printf("%c",(char)(64+j));
			}
			System.out.printf("\n");
		}
		
		//Third Approach
		System.out.println("\nThird Approach");
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				if(i>=j){
					System.out.printf("%c",(char)(64+j));
				}
			}
			System.out.printf("\n");
		}
	}
}