/*
An automobile company manufactures both a two wheeler (TW) and a four
wheeler (FW). A company manager wants to make the production of both
types of vehicle according to the given data below:
• 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
• 2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to
manufacture as per the given data.
Example :
Input :
• 200 -> Value of V
• 540 -> Value of W

Output :
• TW =130 FW=70
Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels
Constraints :
• 2<=W
• W%2=0
• V<W
Print "INVALID INPUT" , if inputs did not meet the constraints.
The input format for testing
The candidate has to write the code to accept two positive numbers separated
by a new line.
• First Input line – Accept value of V.
• Second Input line- Accept value for W.
*/

import java.util.*;
public class VehicalProduction{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of V: ");
		int V = sc.nextInt();
		System.out.print("Enter value of W: ");
		int W = sc.nextInt();
		
		if(W<=2 || W%2!=0 || V>=W){
			System.out.println("INVALID INPUT");
			return;
		}
		
		/*
		x=(Two Wheeler) & y=(Four Wheeler)
		x + y = V
		2x + 4y = W
		
		y = V-x
		2x - 4x + 4V = W
		-2x + 4V = W
		x = (W - 4V)/2
		*/
		
        // Calculate the number of two-wheelers (TW) using the derived formula
        int TW = (4 * V - W) / 2;

        // Calculate the number of four-wheelers (FW)
        int FW = V - TW;

        // Check for validity of the calculated numbers
        if((TW>0 && FW>0) && (TW*2 + FW*4 ==W)){
			System.out.printf("TW =%d FW=%d",TW,FW);
		}
		else{
			System.out.printf("INVALID INPUT");
		}
	}
}