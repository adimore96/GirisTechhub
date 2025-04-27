/*
29. Prime Factorization
Description: Write a program to perform prime factorization of a number n.
Input: n = 12
Output: 2 2 3

in this program we first find the factor of the number then check it is prime or not if it is then we print the factor and divide the num by the factor and store it in num.
*/
public class PrimeFactorization{

    public static boolean isPrime(int num){
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String args[]){

        int num = 12;
         for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
                num /= i;
            }
        }
    }
}