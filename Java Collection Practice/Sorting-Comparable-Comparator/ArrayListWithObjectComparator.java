import java.util.*;

class Pojo{
    private int id;
    private String name;

    Pojo(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    // public int compare(Object obj)
}

 class SortById implements Comparator<Pojo>{
    // override
    public int compare(Pojo obj1, Pojo obj2){
        if(obj1.getId()>obj1.getId()){
            return 1;
        }
        else if(obj1.getId() < obj2.getId()){
            return -1;
        }else{
            return 0;
        }
    }
 }
 class SortByName implements Comparator<Pojo>{
    // override
    public int compare(Pojo obj1, Pojo obj2){
        return obj1.getName().compareTo(obj2.getName());
    }
 }

public class ArrayListWithObjectComparator{
    public static void main(String args[]){
        ArrayList<Pojo> al = new ArrayList<>();

        al.add(new Pojo(10,"ABC"));
        al.add(new Pojo(5,"XYZ"));
        al.add(new Pojo(15,"PQR"));

        Comparator c = new SortById();
        System.out.println("Sort by ID");
        Collections.sort(al,c);

        ListIterator<Pojo> itr = al.listIterator();

        while(itr.hasNext()){
            Pojo obj = itr.next();
            System.out.println(obj.getId()+"    "+obj.getName());
        }


        c = new SortByName();
        System.out.println("Sort by Name");
        Collections.sort(al,c);

         itr = al.listIterator();

        while(itr.hasNext()){
            Pojo obj = itr.next();
            System.out.println(obj.getId()+"    "+obj.getName());
        }
    }
}