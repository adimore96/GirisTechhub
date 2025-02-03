/*
Q2. Write a java program to calculate the sum of 1 to nth prime number using function
recursion.
*/
import java.util.*;
public class SumOfNPrimes {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Nth Value: ");
		
        int n = sc.nextInt(); // Taking input value
        int sum = sumOfNPrimes(n, 0, 2);
        System.out.println("Sum of first " + n + " prime numbers: " + sum);
    }
    
	//check for prime num
    public static boolean isPrime(int num, int divisor) {
        if (num < 2) return false;
        if (divisor * divisor > num) return true;
        if (num % divisor == 0) return false;
        return isPrime(num, divisor + 1);
    }
    
	//sum of prime nums
    public static int sumOfNPrimes(int n, int count, int num) {
        if (count == n) return 0;
        if (isPrime(num, 2)) {
            return num + sumOfNPrimes(n, count + 1, num + 1);
        }
        return sumOfNPrimes(n, count, num + 1);
    }
}
