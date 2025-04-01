import java.util.*;

public class Assignment1{

    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();
        al.add("Virat");
        al.add("Rohit");
        al.add("Hardik Pandya");
        al.add("Jadeja");

        ArrayList al2 = new ArrayList();
        al2.add("Warner");
        al2.add("Smith");
        al2.add("Maxwell");
        al2.add("Marks");

        HashMap hm = new LinkedHashMap();
        hm.put("India",al);
        hm.put("Australia",al2);


        Set<Map.Entry> es = hm.entrySet();
        for(Map.Entry e:es){
            System.out.println("_____________________________");
            System.out.println("Team Name:"+e.getKey());
            System.out.println("Team Name:"+e.getValue());
            System.out.println("_____________________________");
            for(String a:(ArrayList<String>)e.getValue()){
                System.out.print(a+"\t\n");
            }
        }
        
    }
}