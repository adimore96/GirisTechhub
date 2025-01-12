/*
SWAP first and last digit
1234 => 4321
*/
import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int lastDigit = num%10 , firstDigit=0, multipler=1, middlePart, temp=num;
        
        while(num>0){
            int rem = num%10;
            num/=10;
            if(num==0){
				firstDigit = rem;
                System.out.println("firstDigit: "+firstDigit);
                break;
            }
			
			multipler *= 10;
        }
        System.out.println("firstDigit: "+firstDigit+" lastDigit: "+lastDigit+" multipler: "+multipler);
        
    }
}