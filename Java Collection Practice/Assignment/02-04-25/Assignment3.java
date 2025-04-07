import java.util.*;

class Product{
    int id;
    String name;

    Product(int id,String name){
        this.id = id;
        this.name = name;
    }

    //getter methods
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
}

public class Assignment3{

    public static void main(String args[]){

        ArrayList<Product> a1 = new ArrayList<>();
        Product p1 = new Product(1,"A");
        Product p2 = new Product(2,"B");
        Product p3 = new Product(3,"C");
        a1.add(p1);
        a1.add(p2);
        a1.add(p3);

        ArrayList<Product> a2 = new ArrayList<>();
        Product p4 = new Product(1,"D");
        Product p5 = new Product(2,"E");
        Product p6 = new Product(3,"F");
        a2.add(p4);
        a2.add(p5);
        a2.add(p6);

        ArrayList<Product> a3 = new ArrayList<>();
        Product p7 = new Product(1,"A");
        Product p8 = new Product(2,"B");
        Product p9 = new Product(3,"C");
        a3.add(p7);
        a3.add(p8);
        a3.add(p9);

        ArrayList<Product> a4 = new ArrayList<>();
        Product p10 = new Product(1,"D");
        Product p11 = new Product(2,"E");
        Product p12 = new Product(3,"F");
        a4.add(p10);
        a4.add(p11);
        a4.add(p12);

        LinkedHashMap<String,ArrayList> hm1 = new LinkedHashMap<>();
        hm1.put("M001",a1);
        hm1.put("M002",a2);

        LinkedHashMap<String,ArrayList> hm2 = new LinkedHashMap<>();
        hm2.put("M001",a3);
        hm2.put("M002",a4);

        LinkedHashMap hm = new LinkedHashMap();
        hm.put("Production ONE",hm1);
        hm.put("Production TWO",hm2);


        // Output
        Set<Map.Entry> me = hm.entrySet();
        for(Map.Entry e:me){
            System.out.println("----------------------------");
            System.out.println(e.getKey());
            System.out.println("----------------------------");
            // System.out.println(e.getValue());
            LinkedHashMap l1 = (LinkedHashMap)e.getValue();
            Set<Map.Entry> me1 = l1.entrySet();
            for(Map.Entry e1:me1){
                System.out.println("______________________");
                System.out.println(e1.getKey());
                System.out.println("______________________");
                System.out.println("ID\tNAME");
                for(Product p:(ArrayList<Product>)e1.getValue()){
                    System.out.println(p.getId()+"\t"+p.getName());
                    
                }
            }
            // System.out.println("----------------------------");

        }
//  System.out.println("\n\n"+hm);
    }
}