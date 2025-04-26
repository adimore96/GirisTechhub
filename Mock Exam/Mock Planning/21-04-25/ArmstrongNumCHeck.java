/*
6. Armstrong Number
Description: Write a program to check if a number is an Armstrong number.
Input: n = 153
Output: Armstrong
*/

public class ArmstrongNumCHeck{
    public static void armstrongNumCheck(int num){
        int power = 0,temp = num;

        while(num>0){
            num /= 10;
            power++;
        }
        num = temp;

        int armNum = 0;
        while(num>0){
            int rem = num%10;
            armNum += getPower(rem,power);
            num/=10;
        }
        // System.out.println(getPower(num,power));
        if(armNum==temp){
            System.out.println(armNum+" is a Armstrong number.!");
        }else{
            System.out.println(armNum+" is not a Armstrong Number.!");
        }
    }

    // getting the power of num
    public static int getPower(int num,int power){
        int pow=1;
        for(int i=1; i<=power; i++){
            pow *= num;
        }
        return pow;
    }
    public static void main(String args[]){
        int num = 153;
        armstrongNumCheck(num);
    }
}