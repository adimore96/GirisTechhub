import java.util.*;
public class SumDiff{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num1,num2;
        float num3, num4;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextFloat();
        num4 = sc.nextFloat();

        if(num1<1 || num1>Math.pow(10,4) || num2<1 || num2>Math.pow(10,4) || num3<1.0 || num3>Math.pow(10,4) || num4<1.0 || num4>Math.pow(10,4)){
            System.out.println("Invalid Input!");
            return;
        }

        System.out.printf("%d   %d\n",(num1+num2),(num1-num2));
        System.out.printf("%.2f   %.2f\n",(num3+num4),(num3-num4));

    }
}