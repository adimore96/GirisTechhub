/*
 WAP to create function name as 
boolean isDuck(int no) : this function is used for accept number as parameter and check number is duck or not if number is duck return true otherwise return false
Note: A Duck Number is doesn't start with 0 but it has atleast one 0.
 */

import java.util.Scanner;
public class DuckNumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean isDuck = isDuck(num);
        if (isDuck) {
            System.out.println(num+" is a Duck number.");
        }else{
            System.out.println(num+" is not a Duck number.");
        }

    }

    public static boolean isDuck(int num){
        boolean isDuck = false;
        int rem;
        while (num>0){
            rem = num%10;
            if(rem==0){
                isDuck = true;
                break;
            }
            num /= 10;
        }
        return isDuck;
    }
}
