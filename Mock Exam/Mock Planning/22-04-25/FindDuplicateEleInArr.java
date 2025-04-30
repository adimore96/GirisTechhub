/*
12. Find the Duplicate Elements in Array
Description: Find all the duplicate elements in an array.
Input: [1, 2, 3, 4, 5, 1, 3]
Output: [1, 3]
*/
import java.util.*;

public class FindDuplicateEleInArr{
    public static void main(String args[]){
        Integer arr[] = {1,2,3,4,5,1,3};


        // with aam jindagi
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        System.out.print("]");

        // with mentos jindagi
        ArrayList al1 = new ArrayList(Arrays.asList(arr));
        Set al2 = new HashSet();
        for(int e:arr){
            if(Collections.frequency(al1,e)>1){      //Collections.frequency() runs in O(n) time per element, and you’re calling it inside a loop over the array. So, your overall time complexity is O(n²).
                al2.add(e);
            }
        }
        System.out.print(al2);

        // Optimal Approach
        ArrayList al = new ArrayList(Arrays.asList(arr));
        Map<Integer,Integer> m = new HashMap<>();
        Set set = new HashSet();

        for(Object e:al){
            int ele = (int) e;  //Type conversion because we dont use generics
            m.put(ele, m.getOrDefault(ele,0)+1);
            if(m.get(ele)==2){
                set.add(ele);
            }
        }
        System.out.print(set);
    }
}