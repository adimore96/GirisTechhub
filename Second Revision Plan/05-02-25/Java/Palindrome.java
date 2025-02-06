import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        String temp = Integer.toString(num);

        boolean isNegative = false;
        if(num<0){
            num = -num;
            isNegative = true;
        }

        int rev=0;
        while(num>0){
            int rem = num % 10;
            rev = rev*10 + rem;
            num /= 10;
        }
        String rev1 = "";
        if(isNegative){
            rev1 = Integer.toString(rev)+"-";
        }else{
            rev1 = Integer.toString(rev);
        }

        if(temp.equals(rev1)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}