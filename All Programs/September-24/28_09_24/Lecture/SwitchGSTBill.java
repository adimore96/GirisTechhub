import java.util.*;
public class SwitchGSTBill{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Quantity: ");
		int quen = sc.nextInt();
		System.out.print("Enter a Rate: ");
		int rate = sc.nextInt();
		
		int amount = quen*rate;
		System.out.print("\n\n1.Bill without GST\n2.Bill With GST \nEnter Choice: ");
		int ch = sc.nextInt();
		
		switch(ch){
			case 1:{
				System.out.print("\nYour Bill without GST is: "+amount);
				break;
			}
			case 2:{
				int gst = ((amount*18)/100);
				amount += gst;
				System.out.print("\nYour Bill with GST is: "+amount);
				break;
			}
			default: {
				System.out.print("Enter a valid Choice");
			}
		}
	}
}