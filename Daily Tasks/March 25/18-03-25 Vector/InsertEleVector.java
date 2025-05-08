// Q1. Write a program to insert an element at the 2nd position in a Vector.

import java.util.*;

public class InsertEleVector{
    public static void main(String args[]){

        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        // Ways to Display Vector Direct and Through iterator
        System.out.println("Vector Data: "+v);

        //Adding element at 2nd position
        v.add(1,100);
        v.set(1,200);
        System.out.print("Vector Elements: ");
        for(int i=0; i<v.size(); i++){
            System.out.print(v.get(i)+" ");
        }
    }
}