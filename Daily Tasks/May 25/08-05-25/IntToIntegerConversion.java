/*
Convert a primitive int value to an Integer object and then convert it back to a primitive. 
Print all values.
*/

public class IntToIntegerConversion{
    public static void main(String args[]){
        int a = 5;
        Integer b = Integer.valueOf(a); // valueOf() method is the static method present in the Wrapper class which is used to convert the primitive datatype value into the referentail Integer object value.

        int c = b.intValue(); // intvalue() this method present in abstract Number class used to convert refrential object value into primitive datatype value.

        System.out.println("Primitive Datatype a: "+a);
        System.out.println("Wrapper (Referential) Datatype b: "+b);
        System.out.println("Primitive Datatype c: "+c);

    }
}