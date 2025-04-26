/*
4. Prime Numbers
Description: Write a program to print all prime numbers up to a given number n.
Input: n = 10
Output: 2 3 5 7
*/

public class PrimeNumInRange{
    public static boolean isPrime(int num){
        boolean isPrimeNum = true;
        for(int i=2; i<Math.sqrt(num); i++){
            if(num%i==0){
                isPrimeNum = false;
                break;
            }
        }

        return isPrimeNum;
    }
    public static void main(String args[]){
        int num = 10;
        for(int i=2; i<=num;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}