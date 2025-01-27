/*
Q1. Write a java program to check whether number is strong or not. 
145
*/

public class StrongNum{

    public static int factorial(int num){
        int fact = 1;
        for(int i=num; i>0; i--){
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
        int num = 21;

        int temp = num;
        int sum=0;
        while(num>0){
            int rem = num % 10;
            sum += factorial(rem);
            num /= 10;
        }

        if(sum==temp){
            System.out.printf("%d is a Strong Number",temp);
        }else{
            System.out.printf("%d is not a Strong Number",temp);
        }
    }
}