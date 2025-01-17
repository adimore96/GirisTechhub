/*
6. Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.
*/

class Animal{
    public void move(){
        System.out.println("Animal can move..!");
    }
}

class Cheetah extends Animal{
    public void move(){
        System.out.println("Cheetah can run..!");
    }
}

public class AnimalMoveApp{
    public static void main(String args[]){
        Cheetah ch = new Cheetah();
        ch.move();
    }
}