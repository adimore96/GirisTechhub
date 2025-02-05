import java.util.*;
public class ReverseNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean isNegative = false;
        if(num<0){
            num = -num;
            isNegative = true;
        }
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num /= 10;
        }
        if(isNegative){
            System.out.println(-rev);
        }else{
            System.out.println(rev);
        }
    }
}