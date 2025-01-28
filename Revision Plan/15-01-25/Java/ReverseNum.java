/*
Q3. Write a Java program to reverse a number without using loop.
			Input a number: 123
			Reverse number: 321
*/
public class ReverseNum{
    public static void main(String args[]){
        int num = 123;
        int rev = 0;
        System.out.println("Original Num: "+num);
        
        int rem = num % 10;
        rev = rev * 10 +rem;
        num /= 10;

        rem = num % 10;
        rev = rev * 10 +rem;
        num /= 10;

        rem = num % 10;
        rev = rev * 10 +rem;
        num /= 10;

        System.out.println("Reversed Num: "+rev);
    }
}