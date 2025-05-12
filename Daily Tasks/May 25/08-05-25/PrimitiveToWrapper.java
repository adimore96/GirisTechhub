import java.util.*;

public class PrimitiveToWrapper{
    public static void main(String args[]){
        int a=10;
        System.out.println("Primitive int a: "+a);

        Integer i = Integer.valueOf(a); //Boxing
        System.out.println("Manual Boxing: "+i);

        int b = i.intValue(); //Unboxing
        System.out.println("Manual Unboxing: "+b);

        int c = i; // AutoBoxing
        System.out.println("Autoboxing: "+c);

        Integer j = c; // AutoUnboxing
        System.out.println("AutoUnboxing: "+j);
    }

}