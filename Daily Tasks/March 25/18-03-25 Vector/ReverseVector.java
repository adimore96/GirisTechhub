// Q2. Write a program to reverse the elements of a Vector without using built-in methods.

import java.util.Vector;
public class ReverseVector{
    public static void main(String args[]){

        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println("Original Vector: "+v);

        // reverse vactor without inbuilt function
        reverse(v);

        System.out.println("After Reversing Vector: "+v);

    }

    public static void reverse(Vector<Integer> v){
        for(int i=0, j=v.size()-1; i<v.size()/2; i++,j--){
            int temp = v.get(j);
            v.set(j,v.get(i));
            v.set(i, temp);
        }
    }
}