import java.util.*;

public class ArrayListExp{

    public static void main(String args[]){

        // List al =  new ArrayList(Arrays.asList(10,20,30));
        List al =  new ArrayList(List.of(10,20,30));  //You can also use List.of to create a list
        
        System.out.println(al.get(1));
        System.out.println(al.add(100));
        System.out.println(al);
        System.out.println(al.set(1,500)); //returns the element which is replaced (20)
        System.out.println(al.contains(500));
        System.out.println(al.size());  //returns the size of the arraylist
        System.out.println(al.isEmpty());
        System.out.println(al.indexOf(500));
        System.out.println(al);
        al.add(1,400); //it doesnt return anything, return type is void, insert and shift arraylist elements
        System.out.println(al);
        System.out.println(al.remove(1));
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        al.addAll(Arrays.asList(999,888,333,999)); //This method add the all elements in one list to other

        al.removeAll(Arrays.asList(999,888)); //This methods removes all the elements contains in passed list from main list

        System.out.println(al);
    }
}