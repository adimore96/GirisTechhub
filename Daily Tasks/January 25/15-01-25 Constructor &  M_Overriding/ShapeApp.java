/*
3.Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
*/

class Shape{
    public int getArea(){
        return -1;
    }
}

class Rectangle extends Shape{
    private int height, width;
    Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    public int getArea(){
        return height*width;
    }
}

public class ShapeApp{
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(5,4);
        System.out.println("Area of rectangle: "+r1.getArea());
    }
}