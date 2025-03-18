// Q3. Write a program to merge two Vector and store the result in a third vector.

import java.util.*;

public class MergeVector{

    public static void main(String args[]){

        Vector<Integer> v1 = new Vector<>();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);

        System.out.println(v1+" Size: "+v1.size());

        List<Integer> v2 = new Vector<>();
        v2.add(50);
        v2.add(60);
        v2.add(70);
        v2.add(80);

        System.out.println(v2+" Size: "+v2.size());

        Vector<Integer> v3 = new Vector<>();

        for(int i=0; i<v1.size(); i++){
            v3.add(v1.get(i));
        }
        for(int i=0; i<v2.size(); i++){
            v3.add(v2.get(i));
        }

        System.out.println(v3+" Size: "+v3.size());

    }
}