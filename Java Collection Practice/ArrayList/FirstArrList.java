import java.util.*;

public class FirstArrList{
    public static void main(String args[]){

        List<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);   
        list.add(30);

        // set(index,Value): It requires the index to update the value. Remember index must be present then only it update the value.
        list.set(2,40);

        System.out.println(list);
    }
}