import java.util.*;

class Player{
    int id;
    String name;

    Player(int id, String name){
        this.id = id;
        this.name = name;
    }

    //getter Methods
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
}

public class Assignment2{
    public static void main(String args[]){

        ArrayList<Player> al = new ArrayList();

        Player p1 = new Player(1,"ABC");
        Player p2 = new Player(2,"MNO");
        Player p3 = new Player(3,"PQR");

        al.add(p1);
        al.add(p2);
        al.add(p3);


        ArrayList<Player> a2 = new ArrayList();

        Player p4 = new Player(1,"XYZ");
        Player p5 = new Player(2,"STV");
        Player p6 = new Player(3,"SSS");

        a2.add(p1);
        a2.add(p2);
        a2.add(p3);


        LinkedHashMap hm = new LinkedHashMap();
        hm.put("FY",al);
        hm.put("SY",a2);

        Set<Map.Entry> me = hm.entrySet();
        for(Map.Entry e:me){
            System.out.println("\nClass:"+e.getKey());
            System.out.println("--------------------------");
            System.out.println("ID\tName");
            for(Player p:(ArrayList<Player>)e.getValue()){
                System.out.println(p.getId()+"\t"+p.getName());
            }
        }
       
    }
}