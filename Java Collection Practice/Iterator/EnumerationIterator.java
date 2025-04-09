import java.util.*;

public class EnumerationIterator{

    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Vector<Integer> v = new Vector<>(al);
        // Vector<Integer> v = new Vector<>(Arrays.asList(10,20,30,40,50,60));
        System.out.println(v);

        // Enumeration Iterator
        Enumeration<Integer> e = v.elements();

        while(e.hasMoreElements()){
            System.out.print(e.nextElement()+"  ");
        }
    }
}