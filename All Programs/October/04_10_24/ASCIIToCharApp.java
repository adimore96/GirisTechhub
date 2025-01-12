//Write a java program to print all ASCII character with their values.

public class ASCIIToCharApp{
	public static void main(String args[]){
		System.out.println("*****************ALL ASCII VALUES WITH CHARACTER*****************");
		int i=0;
		
		while(i<128	){
			System.out.printf("ASCII Code:%d   ASCII Char:%c\n",i,(char)i);
			i++;
		}
	}
}