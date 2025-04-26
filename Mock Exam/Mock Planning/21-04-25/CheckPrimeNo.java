/*
13. Check for Prime Number
Description: Write a program to check if a number n is prime.
Input: n = 7
Output: Prime
*/

public class CheckPrimeNo{
    
    // logic for prime num
    public static boolean isPrime(int num){
        boolean isPrime = true;
        if(num<2) return false;
        for(int i=2; i<Math.sqrt(num); i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String args[]){
        int num = 7;

        for(int i=1; i<=num; i++){
            if(isPrime(i)){
                System.out.print(i+"    ");
            }
        }

    }
}