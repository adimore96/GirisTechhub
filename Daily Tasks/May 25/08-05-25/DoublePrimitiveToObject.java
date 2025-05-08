/*
Convert a double primitive value into a Double object using both autoboxing and the valueOf() method.
*/


public class DoublePrimitiveToObject{
    public static void main(String args[]){
        double a = 10.5;

        Double b = Double.valueOf(a);
        Double c = a;

        System.out.println("double value: "+a);
        System.out.println("Double (manual conversion) value: "+b);
        System.out.println("double (autoboxing) value: "+c);
    }
}