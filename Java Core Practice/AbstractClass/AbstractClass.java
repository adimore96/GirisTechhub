/*
Abstract Class:
    -for abstract methods it is necessary to override it in inherited class
    -for concreate/non abstract methods we have to create the instance derived class
    -Abstract class cannot be instantiated - cannot create of an object
    -It can have abstract and non-abstract methods
    -It can have constructor, fields and static methods. 
*/

abstract class Abc{
    static int  a = 10;
    abstract void hello();
    public void display(){
        System.out.println("Hello Word!");
    }
}

public class AbstractClass extends Abc{
    void hello(){}
    public static void main(String args[]){
        AbstractClass ac = new AbstractClass();
        System.out.println(a);
        ac.display();
    }
}