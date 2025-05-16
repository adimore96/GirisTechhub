/*
Interface:

constant variables:
	- by default variables are constant (static final)
	- we can write static final (constant) fields in interface which is directly accessed inside the implementing class.

methods in interface:
	-abstract methods. -- abstract method must be override inside the implementing class.
	-static methods  -- static methods can accessed using the Interface name dot static method name
	-default methods --needs the object of implementing class to access the default methods
*/

interface Abc{
    public static final int a = 10;

    public static  void getData(int num){
        System.out.println("Num: "+num);
    }

    default void displayTable(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num+"*"+i+" : "+(i*num));
        }
    }

}
class B{
    public static void display(int num){
        System.out.println(num);
    }
}
public class FirstInterface extends B implements Abc{
    public static void main(String args[]){
        System.out.println(a);
        System.out.println(a);
        display(50);
        Abc.getData(10);

        FirstInterface instance = new FirstInterface();
        instance.displayTable(9);

    }
}