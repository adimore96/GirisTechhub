import java.util.*;

public class UniIterator{
    public static void main(String args[]){

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        // Iterator
        Iterator<Integer> it = al.iterator();

        while(it.hasNext()){
            Integer ele = it.next();
            if(ele.intValue()==30){
                it.remove();
                continue;
            }
            System.out.println(ele);
        }

        System.out.println(al);
    }
}