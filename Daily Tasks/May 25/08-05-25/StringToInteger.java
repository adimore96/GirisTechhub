/*
Take a String input from the user (like '123'), convert it into an int using a wrapper class method, and add 10 to it. Print the result.
*/

import java.util.*;

public class StringToInteger{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // Integer num = Integer.parseInt(str);  //btw parseInt() method returns the primitive int value :)
        int num = Integer.valueOf(str);  //btw it returns the Integer object, here autounboxing is performing
        Integer num1 = Integer.valueOf(str); 
        // or
        int num2 = num1.intValue();


        System.out.println("String Value: "+str);
        System.out.println("int Value (autounboxing): "+num);
        System.out.println("Integer Value: "+num1);
        System.out.println("int Value: "+num2);
        System.out.println("Adding 10 to "+num+" sum is: "+(num+10));

    }
}