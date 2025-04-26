import java.util.*;

public class SumOfNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        // for(int i=n;i>=1;i--){
        //     sum += i;
        // };

        for(int i=n; i>=1; sum+=i,i--){}

        System.out.println(sum);
    }
}