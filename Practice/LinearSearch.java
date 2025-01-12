import java.util.Scanner;
public class LinearSearch{
	public void Search(int num,int arr[]){
		boolean flag = false;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==num){
				System.out.print("Element "+num+" found at "+i+" location.");
				flag = true;
			}
		}
		if(flag==false){
			System.out.print("Element not found" );
		}
	}
	public static void main(String args[]){
		LinearSearch ls = new LinearSearch();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number to search ");
		int num = sc.nextInt();
		int arr[] = {10,50,30,45,20,28};
		ls.Search(num,arr);
		
		
		
		
	}
}