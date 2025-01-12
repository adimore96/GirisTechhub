//Q.1 Write a java program to take 5 elements in a Array and display it.
import java.util.Scanner;

public class ArrayDisplay 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array elements are:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}