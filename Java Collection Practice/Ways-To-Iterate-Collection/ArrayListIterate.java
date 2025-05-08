import java.util.*;

public class ArrayListIterate{

    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);

        // using for loop
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        // using enhanced for loop
        for(int ele:al){
            System.out.print(ele+" ");
        }
        System.out.println();

        // using iterator
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();
        // using listIterator
        ListIterator<Integer> litr = al.listIterator();
        while(litr.hasNext()){
            System.out.print(litr.next()+" ");
        }
    }
}