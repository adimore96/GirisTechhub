import java.util.*;

public class IntToRoman{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<1 || num>3999){
            System.out.println("Enter Valid number...!");
            return;
        }
        int decimal = num;
        int values[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String romans[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0; i<values.length; i++){
            while(num>=values[i]){
                if(num>= values[i]){
                    roman.append(romans[i]);
                    num -= values[i];
                }
            }
        }
        System.out.println(roman);

    }
}