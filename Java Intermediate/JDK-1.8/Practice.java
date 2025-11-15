/*
This java program file is create for revision purpose,
Please ignore this..!
*/

/*
    Static method defined within interface are only accessible by interface name.
    They are not accessible by implementing class object or interface object.
    But Static variables defined within interface are accessible by implementing class object or interface object.

    But Static methods defined inside class are accessible by class name or class object.

    Default methods defined within interface are accessible by implementing class object or interface object.
    and also can be overridden by implementing class.
    and Default methods cannot be static or final.
    and also cannot be private.
    and they must have method body.
    and they are used to provide default implementation to the methods of interface.
    and they are introduced in java 8.
    and they are used to avoid the problem of multiple inheritance in interfaces.
    and they are used to add new methods to the existing interfaces without breaking the existing implementation of the interface.
    and they are used to provide backward compatibility to the interfaces.
    and they are used to provide a way to extend the interfaces in future versions of java.
    and they are used to provide a way to add new methods to the interfaces without breaking the existing implementation of the interface.
*/

 interface Animal{
    public int x = 10;
    public void bark();

    public  static final int y = 20;

    // Static method definition within interface
    public static void sound(){
        System.out.println("Animal Sound....!");
    }
    
    public default void movement(){
        System.out.println("Animal Movement....!");
    }
}

class Dog{
    public static int b = 50;
    public int a = 10;
    public static void run(){
        
        System.out.println("[Dog]: Run method called..!"+(new Dog()).a+" "+b);
    }

    public void update(){
        b = 100;
    }
}

public class Practice implements Animal{
    public void bark(){
            // sound();
        }
        
    public static void main(String args[]){
        Dog d = new Dog();

        System.out.println("Hello World! "+x+" "+y+" "+d.a+" "+d.b);
        d.run();
        d.update();
        System.out.println(Dog.b);
        Animal ani = new Practice();
        Animal.sound();
        System.out.println(ani.x+" "+Animal.y);
        d.run();

        // ani.bark();
    }
}