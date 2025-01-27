/*
Q3. Write a java program to swap to first two digit & last two digit of a number.
	Input : 12345
	Output : 45312
*/

public class SwapDigits{
    public static void main(String args[]){
        int num = 123456;
        int lastDigits = num%100;
        int firstDigits = num/10000;
        int middlePart = (num/100)%100;
        System.out.println(lastDigits*10000 + middlePart*100 + firstDigits);

    }
}