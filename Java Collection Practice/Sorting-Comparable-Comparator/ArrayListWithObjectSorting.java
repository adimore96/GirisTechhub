import java.util.*;

class Pojo implements Comparable {
    public int id;
    public String name;

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

    // Override the compareTo(Object) method
    public int compareTo(Object obj){
        Pojo obj1 = (Pojo) obj;
        if(this.id>obj1.id){
            return 1;
        }
        else if(this.id<obj1.id){
            return -1;
        }else{
            return 0;
        }
    }


}

public class ArrayListWithObjectSorting{
    public static void main(String args[]){
        ArrayList<Pojo> al = new ArrayList<>();

        al.add( new Pojo(5,"ABC"));
        al.add(new Pojo(2,"PQR"));
        al.add(new Pojo(12,"PPP"));
        al.add(new Pojo(1, "XYZ"));

        Collections.sort(al);

        ListIterator<Pojo> itr = al.listIterator();

        while(itr.hasNext()){
            Pojo obj =  itr.next();
            System.out.println(obj.getId()+" "+obj.getName());
        }
    }
}