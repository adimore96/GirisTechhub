/*
 WAP to create function name as 
public static boolean isPrime(int no): this function can accept number and parameter and check number is prime or not if number is prime then return true otherwise return false.

 */

import java.util.Scanner;
public class PrimeNumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.printf("%d is a Prime number...!",num);
        }else{
            System.out.printf("%d is not a Prime number...!",num);
        }

    }

    public static boolean isPrime(int num){
        System.out.println("Hii");
        boolean prime = true;
        int i=2;
        while(i<= (num/2)){
            System.out.println("Hii");
            if(num%i==0){
                prime = false;
                break;
            }
            i++;
        }
        return prime;
    }
}
