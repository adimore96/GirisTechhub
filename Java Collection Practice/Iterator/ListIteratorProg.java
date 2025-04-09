import java.util.*;

public class ListIteratorProg{
    public static void main(String args[]){

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        ListIterator<Integer> li = al.listIterator();

        if(li.hasNext()){
                Integer current = li.next();
                while(li.hasNext()){
                    Integer next = li.next();
                    System.out.println(current+"\t"+next);
                    current = next;
                    if(next==20){
                        // li.add(90);  //--------> This is problematic because after calling li.add(), the iterator points to the newly added element (which is 90), not the element you were trying to modify (which is 50). 
                        // li.set(999);  //-------> The set() method can only modify an element that was previously returned by the next() or previous() methods, and it cannot be called immediately after add() without first calling next() or previous() again.


                        li.set(999);
                        li.add(90); //add the element next to the current iterator
                    }
                    
                }

        }

        System.out.println(al);
    }
}