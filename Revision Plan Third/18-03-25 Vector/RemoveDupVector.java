// Q4. Write a program to remove duplicate elements from a Vector.

import java.util.*;
public class RemoveDupVector{

    public static void main(String args[]){
        Vector<Integer> v1 = new Vector<>(Arrays.asList(10,20,30,20,40,50,10,20,30));
        // Remember Arrays.asList(comma seprated numbers... or array) is used to convert array to list 
        System.out.println(v1);
        
        // Removing duplicates using LinkedHashSet
        //v1 = new Vector(new LinkedHashSet(v1));

        // Removing Duplicate Manually
        for(int i=0; i<v1.size(); i++){
            for(int j=i+1; j<v1.size(); j++){
                if(v1.get(i).equals(v1.get(j))){
                    v1.remove(j);
                    j--;
                }
            }
        }
        System.out.println(v1);
    }
}